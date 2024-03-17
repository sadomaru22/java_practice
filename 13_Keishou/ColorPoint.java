// package java_practice.13_Keishou;

public class ColorPoint extends Point {
   private String color;

   ColorPoint(int x, int y, String color) {
      super(x, y);
      this.color = color;
   }

   void showColorPoint() {
      System.out.println("X座標は" + getX() + ", Y座標は" + getY());
      System.out.println("色：" + color);
   }

   public String getColor() {
      return color;
   }

   void setColor(String color) {
      this.color = color;
   }
}
