package example;

import com.fasterxml.jackson.databind.ObjectMapper;
import example.model.Vine;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class VineHolder {

    private String fileName = "F:/vine_database/vines.txt";

    private ObjectMapper objectMapper = new ObjectMapper();
     private List<Vine> vines = new ArrayList<>();

    public void addVine(Vine vine) {
        vines.add(vine);
    }

    public void removeVine(Vine vine) {
        vines.remove(vine);
    }

    public void saveVinesToDatabase() {
        File file = new File(fileName);

        try {
            new File("F:/vine_database").mkdirs();
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for(Vine vine : vines) {
               String jsonVine = objectMapper.writeValueAsString(vine);
                fileWriter.append(jsonVine + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("WRONG FILE PATH!");
            throw new RuntimeException(e);
        }
    }

    public void loadVinesFromTheFile(){
        File file = new File(fileName);
        try {
            List<String> vinesList = FileUtils.readLines(file, StandardCharsets.UTF_8);
            for (String vineString : vinesList) {
               Vine loadVine = objectMapper.readValue(vineString, Vine.class);
               vines.add(loadVine);
            }
            System.out.println(vines);
        } catch (FileNotFoundException e) {
            System.out.println("Database file does not exist!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void displayVineConsole() {
        for(Vine vine : vines) {
            System.out.println("Vine: " + vine);
        }
    }

    public List<Vine> getVines() {
        return vines;
    }

    public void setVines(List<Vine> vines) {
        this.vines = vines;
    }
}
