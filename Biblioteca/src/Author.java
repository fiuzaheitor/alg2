public class Author {
    private String name;
    private Integer birthDate;

    public Author(String name, Integer birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }
}

