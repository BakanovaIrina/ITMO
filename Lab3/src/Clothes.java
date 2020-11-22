import java.util.Objects;

public class Clothes extends Thing {
    private PartsOfBody part;

    Clothes(String name, String description, PartsOfBody part) {
        super(name, description, "ношение на теле");
        setPart(part);
        setName(name);
    }

    public String getPart() {
        return part.getName();
    }

    public void setPart(PartsOfBody part) {
        this.part = part;
    }

    public String toString() {
        return "Clothes{" +
                "part=" + part +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes clothes = (Clothes) o;
        return part == clothes.part;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), part);
    }
}