package example;

import example.model.Vine;
import example.model.VineType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VineHolder vineholder = new VineHolder();

        // Adding to a file:

/*        Vine vine = new Vine();
        vine.setId(1L);
        vine.setName("Vine number 1");
        vine.setYear(2001L);
        vine.setType(VineType.RED);
        vine.setCountryOfOrigin("Italy");

        Vine vine2 = new Vine();
        vine2.setId(2L);
        vine2.setName("Vine number 2");
        vine2.setYear(1954L);
        vine2.setType(VineType.GREEN);
        vine2.setCountryOfOrigin("France");

        Vine vine3 = new Vine();
        vine3.setId(3L);
        vine3.setName("Vine number 3");
        vine3.setYear(1993L);
        vine3.setType(VineType.PINK);
        vine3.setCountryOfOrigin("Germany");

        vineholder.addVine(vine);
        vineholder.addVine(vine2);
        vineholder.addVine(vine3);
        vineholder.displayVineConsole();
        vineholder.saveVinesToDatabase(); */

        // Loading from a file:

        vineholder.loadVinesFromTheFile();
        vineholder.displayVineConsole();



    }
}
