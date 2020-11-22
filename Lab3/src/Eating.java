public interface Eating {
    boolean getLastEating();

    int getHunger();

    void setHunger(int hunger);

    void increaseHunger(int point);

    void reduceHunger(int point);

    void isFull();

    void isHungry();

    void eatPlant(Fetus food);

    void tryFetus(Fetus fetus);

    void similarityOfTaste(Fetus fetus1, Fetus fetus2);

    void getTimeEating();

}