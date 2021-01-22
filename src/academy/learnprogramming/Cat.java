package academy.learnprogramming;

public class Cat extends Animal{
    private String name;
    private String eyeColour;
    private String coatColour;
    private boolean sleeping;

    public Cat(int legs, int eyes, boolean fur, boolean tail, String name, String eyeColour, String coatColour, boolean sleeping) {
        super(legs, eyes, fur, tail);
        this.name = name;
        this.eyeColour = eyeColour;
        this.coatColour = coatColour;
        this.sleeping = sleeping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getCoatColour() {
        return coatColour;
    }

    public void setCoatColour(String coatColour) {
        this.coatColour = coatColour;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }
}
