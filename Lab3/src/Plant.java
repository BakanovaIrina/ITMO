import java.util.Objects;

public class Plant {
    private String location;
    private final String name;
    private final String form;

    Plant(String name, String form) {
        this.name = name;
        this.form = form;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public String getForm() {
        return this.form;
    }

    public String toString() {
        return "Plant{" +
                "location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", form='" + form + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(location, plant.location) &&
                Objects.equals(name, plant.name) &&
                Objects.equals(form, plant.form);
    }

    public int hashCode() {
        return Objects.hash(location, name, form);
    }
}