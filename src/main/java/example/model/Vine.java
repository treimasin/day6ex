package example.model;

public class Vine {
    private Long id;
    private String name;
    private Long year;
    private VineType type;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public VineType getType() {
        return type;
    }

    public void setType(VineType type) {
        this.type = type;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    private String countryOfOrigin;

    @Override
    public String toString() {
        return "Vine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", type=" + type +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
