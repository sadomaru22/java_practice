// package java_practice.14_Interface;

public class Circle3 extends Figure {

   int hankei;

   Circle3(int hankei) {
      this.hankei = hankei;
   }

   int getArea() {
      return hankei * hankei * 3;
   };
}
