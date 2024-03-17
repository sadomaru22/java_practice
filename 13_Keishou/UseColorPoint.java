// package java_practice.13_Keishou;

public class UseColorPoint {

   public static void main(String[] args) {
      Point[] pArray = {
            new Point(3, 9),
            new ColorPoint(2, -3, "RED"),
            new Point(56, 2),
            new ColorPoint(7, -28, "BLUE"),
      };

      for (Point data : pArray) {
         data.showPoint();
         if (data instanceof ColorPoint) {
            data.showColorPoint();
         }
      }
   }
}
