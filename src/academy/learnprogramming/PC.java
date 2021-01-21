package academy.learnprogramming;

public class PC {
    private Case thisCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thisCase, Monitor monitor, Motherboard motherboard) {
        this.thisCase = thisCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getThisCase() {
        return thisCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
