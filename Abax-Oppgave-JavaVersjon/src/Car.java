public class Car extends Vehicle{
    protected String color;

    public Car(String color, String brand, String type, int effect, int maxSpeed, String regNumber){
        this.color = color; // This=car. Altså car.color = color
        this.brand = brand;
        this.type = type;
        this.effect = effect;
        this.maxSpeed = maxSpeed;
        this.regNumber = regNumber;
    }

    public void Drive() {
        System.out.println("The " + brand + " drives in a drittfart, Petter Solberg!");
    }
}
