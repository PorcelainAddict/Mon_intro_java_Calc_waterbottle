public class WaterBottle {
    private int volume;
    private int drink;
    private int replenish;

   public WaterBottle(int volume, int drink) {
       this.volume = volume;
       this.drink = drink;
   }

   public int getVolume() {
       return volume;
   }

   public int drink() {
       return volume -= 10;
   }

   public int maxThirst() {
       return volume -= 100;
   }

   public int replenish() {
       if (this.volume == 0) {
           return volume += 100;
       } else {
           return 0;
       }
   };
}
