// package java_practice.16_Exception;

public class Circle4 {
   public static final double PI = 3.14;
   private double radius;

   public Circle4(double radius) throws InvalidSizeException {
      if (radius <= 0) {
         throw new InvalidSizeException("半径は0より大きくなければなりません。");
      }
      this.radius = radius;
   }

   public double area() {
      return radius * radius * PI;
   }
}
