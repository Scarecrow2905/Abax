import java.util.Properties;

public class Plane extends Vehicle{
    protected int wingspan;
    protected int loadCapacity;
    protected int weight;
    protected String flightClass;

    public Plane(String regNumber, int effect, int wingspan, int loadCapacity, int weight, String flightClass) {
        this.regNumber = regNumber;
        this.effect = effect;
        this.wingspan = wingspan;
        this.loadCapacity = loadCapacity;
        this.weight = weight;
        this.flightClass = flightClass;
    }

    public void Fly(){
        System.out.println( "The " + flightClass +  " has lift-off! Granka next!");
    }

}
