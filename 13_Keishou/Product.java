public class Product {
   int price;

   Product(int price) {
      this.price = price;
   }

   void showPrice() {
      System.out.println("価格" + price + "円");
   }
}
