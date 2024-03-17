// package java_practice.11_ClassAndObject;

public class UseClaseeAndObject11 {
   public static void main(String[] args) {
      ClassAndObject11 classAndObject11 = new ClassAndObject11();

      classAndObject11.height = 15;
      classAndObject11.width = 7;
      System.out.println("面積1: " + classAndObject11.squeaArea());
      classAndObject11.height = 6;
      classAndObject11.width = 6;
      System.out.println("面積2: " + classAndObject11.squeaArea());
      System.out.println("四角形の辺の数は: " + ClassAndObject11.sideNumber + "です");

      classAndObject11.setData(11, 15);
      System.out.println("面積3: " + classAndObject11.squeaArea());
      classAndObject11.setData(220);
      System.out.println("面積4: " + classAndObject11.squeaArea());
   }
}
