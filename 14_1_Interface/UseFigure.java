public class UseFigure {
   public static void main(String[] args) {
      Figure[] f = {
            new Circle3(2),
            new Triangle(20, 5),
            new Square5(9, 10)
      };

      for (int i = 0; i < f.length; i++) {
         System.out.println("図形" + i + "の面積:" + f[i].getArea());
      }
   }
}
