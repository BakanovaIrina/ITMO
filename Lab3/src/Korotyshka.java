import java.util.ArrayList;
import java.util.Objects;

class Korotyshka extends PhysicalBody implements Traсking, Eating {

    private int hunger;
    private String spy;
    private int caution;
    private ArrayList<Clothes> clothes = new ArrayList<Clothes>();
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Korotyshka(String name, int hunger, int caution, String location) {
        setName(name);
        setHunger(hunger);
        setCaution(caution);
        setLocation(location);
    }

    public boolean getLastEating() {
        return hunger > 50;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void increaseHunger(int point) {
        setHunger(getHunger() + point);
    }

    public void reduceHunger(int point) {
        setHunger(getHunger() - point);
    }

    public void isFull() {
        if (getHunger() == 0) {
            System.out.println(getName() + " полностью насытился ");
        } else {
            System.out.println(getName() + " никак не может насытиться");
        }
    }

    public void isHungry() {
        if (getHunger() > 20) {
            System.out.println(getName() + " голоден. Не утолил голод");
        } else {
            System.out.println(getName() + " не голоден. Утолил голод");
        }
    }

    public void plantThrowAway(Plant plant) {
        System.out.println(getName() + " отшвырнул " + plant.getName());
    }

    public void go(String location) {
        System.out.println(getName() + " пошел к " + location);
        replace(location);
    }

    public void find(String target, String location) {
        System.out.println(getName() + " ищет " + target);
        if (!(getLocation().equals(location))) {
            go(location);
        }
    }

    public void eatPlant(Fetus food) {
        if (getHunger() > 20) {
            System.out.println(getName() + " ест " + food.getName());
            if (food.getName().equals("Лунная груша") | food.getName().equals("Лунное яблоко")) {
                reduceHunger(0);
            } else {
                reduceHunger(food.getSatiety());
            }
        } else {
            System.out.println(getName() + " не голоден, поэтому он не будет есть");
        }
    }

    public void tryFetus(Fetus fetus) {
        System.out.println(getName() + " пробует " + fetus.getDescriptionFetus() + " " + fetus.getFetus());
        System.out.println("Это оказалась " + fetus.getName() + " со вкусом " + fetus.getTaste());
        increaseHunger(fetus.getSatiety());

    }

    public void similarityOfTaste(Fetus fetus1, Fetus fetus2) {
        if (fetus1.getTaste().equals(fetus2.getTaste())) {
            System.out.println("Вкус " + fetus1.getName() + " ничем не отличается от " + fetus2.getName());
        } else {
            System.out.println("Вкус " + fetus1.getName() + " отличается от " + fetus2.getName());
        }
    }

    public void getTimeEating() {
        if (!getLastEating()) {
            System.out.println(getName() + " давно не ел.");
        } else {
            System.out.println(getName() + " поел недавно.");
        }
    }

    public int getCaution() {
        return caution;
    }

    public void setCaution(int caution) {
        this.caution = caution;
    }

    public String getSpy() {
        return spy;
    }

    public void setSpy(String spy) {
        this.spy = spy;
    }

    public void follow(Korotyshka korotyshka) {
        System.out.println(getName() + " следит за " + korotyshka.getName());
        korotyshka.setSpy(getName());
    }

    public boolean getTracking() {
        return spy != null;
    }

    public void noticeSurveillance() {
        if (getCaution() > 50) {
            if (getTracking()) {
                System.out.println("За " + getName() + " следит " + getSpy());
            } else {
                System.out.println("За " + getName() + " никто не следит");
            }
        } else {
            System.out.println(getName() + " слишком неосторожный, поэтому не может никого заметить");
        }
    }

    public void wear(Clothes clothes) {
        this.clothes.add(clothes);
        clothes.setLocation(getLocation());
    }

    public void printClothes() {
        for (int i = 0; i < this.clothes.size(); i++) {
            System.out.println(getName() + " носит на " + this.clothes.get(i).getPart() + " " + this.clothes.get(i).getDescription() + " " + this.clothes.get(i).getName());
        }
    }

    public void have(Thing thing) {
        this.things.add(thing);
        thing.setLocation(getLocation());
    }

    public void printThings() {
        for (int i = 0; i < this.things.size(); i++) {
            System.out.println(getName() + " имеет при себе " + things.get(i).getName() + " которую может использовать " + things.get(i).getDescriptionOfUsing());
        }
    }

    public String toString() {
        return "Korotyshka{" +
                "hunger=" + hunger +
                ", spy='" + spy + '\'' +
                ", caution=" + caution +
                ", clothes=" + clothes +
                ", things=" + things +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Korotyshka that = (Korotyshka) o;
        return hunger == that.hunger &&
                caution == that.caution &&
                Objects.equals(spy, that.spy) &&
                Objects.equals(clothes, that.clothes) &&
                Objects.equals(things, that.things);
    }

    public int hashCode() {
        return Objects.hash(hunger, spy, caution, clothes, things);
    }
}