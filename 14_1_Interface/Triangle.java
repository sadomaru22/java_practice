// package java_practice.14_Interface;

public class Triangle extends Figure {
   int teihen;
   int takasa;

   Triangle(int teihen, int takasa) {
      this.teihen = teihen;
      this.takasa = takasa;
   }

   int getArea() {
      return teihen * takasa / 2;
   }
}
