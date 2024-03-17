// package java_practice.14_Interface;

public class Square5 extends Figure {
   int h;
   int w;

   Square5(int h, int w) {
      this.h = h;
      this.w = w;
   }

   int getArea() {
      return h * w;
   }
}
