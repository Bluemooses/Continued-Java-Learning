package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "500");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getMonitor();
        thePC.getMonitor().drawPixelAt(1500,1200, "blue");
        thePC.getMotherboard().loadProgram("Windows 10");

        Tucker tucker = new Tucker(4, 2, true, true, "Tucker", "Brown", "Brown", false, true, true, true, true);
        tucker.setTuckerToSleeping();


    }
}
