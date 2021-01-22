package academy.learnprogramming;

public class Tucker extends Cat{
    private boolean angry;
    private boolean cranky;
    private boolean smelly;
    private boolean hungry;

    public Tucker(int legs, int eyes, boolean fur, boolean tail, String name, String eyeColour, String coatColour, boolean sleeping, boolean angry, boolean cranky, boolean smelly, boolean hungry) {
        super(legs, eyes, fur, tail, name, eyeColour, coatColour, sleeping);
        this.angry = angry;
        this.cranky = cranky;
        this.smelly = smelly;
        this.hungry = hungry;
    }

    public void setTuckerToSleeping(){
        setSleeping(true);
        System.out.println("Tucker is sleeping");
    }

    public boolean isAngry() {
        return angry;
    }

    public void setAngry(boolean angry) {
        this.angry = angry;
    }

    public boolean isCranky() {
        return cranky;
    }

    public void setCranky(boolean cranky) {
        this.cranky = cranky;
    }

    public boolean isSmelly() {
        return smelly;
    }

    public void setSmelly(boolean smelly) {
        this.smelly = smelly;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
