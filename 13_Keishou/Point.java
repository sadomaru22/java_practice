// package java_practice.13_Keishou;

public class Point {
   private int x;
   private int y;

   Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   void showPoint() {
      System.out.println("X座標は" + x + ", Y座標は" + y);
   }

   public int getX() {
      return x;
   }

   public int getY() {
      return y;
   }

   void setX(int x) {
      this.x = x;
   }

   void setY(int y) {
      this.y = y;
   }
}
