// package java_practice.12_Constructa;

public class Book {
   private String title;
   private String auther;
   private String price;

   Book(String title, String auther, String price) {
      this.title = title;
      this.auther = auther;
      this.price = price;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAuther() {
      return auther;
   }

   public void setAuther(String auther) {
      this.auther = auther;
   }

   public String getPrice() {
      return price;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String showBook() {
      return "タイトル：" + title + "著者：" + auther + "価格：" + price;
   }
}
