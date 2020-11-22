import java.util.Objects;

public class Fetus extends Plant {
    private final String fetus;
    private final String descriptionFetus;
    private final String taste;
    private final int satiety;

    Fetus(String fetus, String taste, String descriptionFetus, int satiety) {
        super("", "");
        this.fetus = fetus;
        this.taste = taste;
        this.descriptionFetus = descriptionFetus;
        this.satiety = satiety;
    }

    Fetus(String name, String form, String fetus, String taste, String descriptionFetus, int satiety) {
        super(name, form);
        this.fetus = fetus;
        this.taste = taste;
        this.descriptionFetus = descriptionFetus;
        this.satiety = satiety;
    }

    public String getFetus() {
        return this.fetus;
    }

    public String getDescriptionFetus() {
        return this.descriptionFetus;
    }

    public String getTaste() {
        return this.taste;
    }

    public int getSatiety() {
        return this.satiety;
    }

    public void plant() {
        System.out.println("Растет " + getForm() + " там, где " + getLocation() + ". На нем растут " + getDescriptionFetus() + " " + getFetus());
    }

    public void saturation() {
        if (this.satiety < 5) {
            System.out.println(super.getName() + " невозможно насытиться. От него только аппетит разыграется.");
        } else {
            System.out.println(super.getName() + " можно насытиться.");
        }
    }

    public String toString() {
        return "Fetus{" +
                "fetus='" + fetus + '\'' +
                ", descriptionFetus='" + descriptionFetus + '\'' +
                ", taste='" + taste + '\'' +
                ", satiety=" + satiety +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fetus fetus1 = (Fetus) o;
        return satiety == fetus1.satiety &&
                Objects.equals(fetus, fetus1.fetus) &&
                Objects.equals(descriptionFetus, fetus1.descriptionFetus) &&
                Objects.equals(taste, fetus1.taste);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), fetus, descriptionFetus, taste, satiety);
    }
}