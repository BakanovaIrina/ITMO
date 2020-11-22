import java.util.Objects;

public class Thing extends PhysicalBody {
    private String descriptionOfUsing;
    private String description;

    Thing(String name, String description, String descriptionOfUsing) {
        this.descriptionOfUsing = descriptionOfUsing;
        this.description = description;
        setName(name);
    }

    public String getDescriptionOfUsing() {
        return descriptionOfUsing;
    }

    public void setDescriptionOfUsing(String descriptionOfUsing) {
        this.descriptionOfUsing = descriptionOfUsing;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Thing{" +
                "descriptionOfUsing=" + descriptionOfUsing + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(descriptionOfUsing, thing.descriptionOfUsing) &&
                Objects.equals(description, thing.description);
    }

    public int hashCode() {
        return Objects.hash(descriptionOfUsing, description);
    }
}