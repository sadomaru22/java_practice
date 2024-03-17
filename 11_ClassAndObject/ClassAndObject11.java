public class ClassAndObject11 {
   // インスタンス変数の宣言
   int height;
   int width;
   static int sideNumber = 4;

   // static変数の宣言と初期化
   // static int staticVal = 100;

   int squeaArea() {
      return height * width;
   }

   void setData(int h, int w) {
      height = h;
      width = w;
   };

   void setData(int len) {
      height = len;
      width = len;
   };

   // // インスタンスメソッドの宣言
   // void instanceMethod() {
   // System.out.println(instanceVal);
   // }

   // // staticメソッドの宣言
   // static void staticMethod() {
   // System.out.println(staticVal);
   // }
}