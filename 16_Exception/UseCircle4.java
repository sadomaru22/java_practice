
public class UseCircle4 {
   public static void main(String[] args) {
      try {
         Circle4 circle = new Circle4(-5); // 無効な半径
      } catch (InvalidSizeException e) {
         System.err.println(e.getMessage());
      }
   }
}
