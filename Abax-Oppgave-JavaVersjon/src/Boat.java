public class Boat extends Vehicle {

   protected int Tonnage;
   protected int MaxSpeed;

   public Boat(String regNumber, int effect, int MaxSpeed, int Tonnage){
      this.regNumber = regNumber;
      this.effect = effect;
      this.MaxSpeed = MaxSpeed;
      this.Tonnage = Tonnage;
   }
}
