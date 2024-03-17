import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("2つの小数を入力してください。");

         System.out.print("最初の小数: ");
         double firstNumber = scanner.nextDouble();

         System.out.print("二番目の小数: ");
         double secondNumber = scanner.nextDouble();

         double sum = firstNumber + secondNumber;
         System.out.println("合計: " + sum);
      } catch (InputMismatchException e) {
         // 入力が小数でない場合にスローされる例外
         System.out.println("少数ではありません。");
      } finally {
         // スキャナーを閉じる
         scanner.close();
      }
   }
}
