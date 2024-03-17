import java.util.ArrayList;

public class FruitList {
   public static void main(String[] args) {
      // String型のArrayListを作成し、くだものを追加
      ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("りんご");
      fruits.add("みかん");
      fruits.add("メロン");
      fruits.add("イチゴ");

      for (String fruit : fruits) {
         System.out.println(fruit);
      }

      System.out.println("---removed---");
      fruits.remove(2);
      for (String fruit : fruits) {
         System.out.println(fruit);
      }
   }
}