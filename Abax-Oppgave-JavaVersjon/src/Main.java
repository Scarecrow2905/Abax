public class Main {
    public static void main(String[] args) {
        System.out.println("Abax-Oppgave");

        //Car
        Car car1 = new Car("Green", "BMW", "Lightweight", 147, 200, "NF123456");
        Car car2 = new Car("Blue", "Ford", "Lightweight", 150, 195, "NF654321");
        // Plane
        Plane plane = new Plane("LN1234", 1000, 30, 2, 10, "Jet");
        // Boat
        Boat boat = new Boat("ABC123", 100, 30, 500);

        // Car
        System.out.println(car1.color);
        System.out.println(car2.regNumber);
        // Sammenlign
        System.out.println(car1.type.equals(car2.type)); // Sammenligner om car1 og car2 er av samme type.
                                                         // Returnerer true eller false.
         car1.Drive();


        // Plane
        System.out.println("PLANE:");
        System.out.println("Reg Number: " + plane.regNumber);
        System.out.println("Effect: " + plane.effect + " KW");
        System.out.println("Wingspan: " + plane.wingspan + " M");
        System.out.println("Load capacity: " + plane.loadCapacity + " Tons");
        System.out.println("Own weight: " + plane.weight + " Tons");
        System.out.println("Flight class: " + plane.flightClass);

        plane.Fly();

        // Boat
        System.out.println("BOAT");
        System.out.println("Reg Number: " + boat.regNumber);
        System.out.println("Effect: " + boat.effect + " KW");
        System.out.println("Max speed: " + boat.maxSpeed + " Knots");
        System.out.println("Tonnage: " + boat.Tonnage + " Tons");
    }
}
