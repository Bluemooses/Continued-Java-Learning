package academy.learnprogramming;

public class Animal {
    private int legs;
    private int eyes;
    private boolean fur;
    private boolean tail;

    public Animal(int legs, int eyes, boolean fur, boolean tail) {
        this.legs = legs;
        this.eyes = eyes;
        this.fur = fur;
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
