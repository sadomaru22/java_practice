public class BookProduct extends Product {
   String title;
   String publisher;

   BookProduct(String title, String publisher, int price) {
      super(price);
      this.title = title;
      this.publisher = publisher;
   }

   void showBook() {
      System.out.println("タイトル:" + title);
      System.out.println("出版社:" + publisher);
      System.out.println("価格:" + price);
   }
}
