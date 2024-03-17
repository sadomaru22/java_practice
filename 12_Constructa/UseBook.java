// package java_practice.12_Constructa;

public class UseBook {
   public static void main(String[] args) {
      Book book1 = new Book("TCP/IP入門", "吉田茂樹", "2200円");
      Book book2 = new Book("XMLの全て", "高橋マナ", "1800円");

      System.out.println(book1.showBook());
      System.out.println(book2.showBook());

      Book[] array = {
            new Book("TCP/IP入門", "吉田茂樹", "2300円"),
            new Book("XMLの全て", "高橋マナ", "1900円"),
            new Book("話せる英文法", "小山裕美", "1500円")
      };

      for (Book data : array) {
         System.out.println(data.showBook());
      }
   }
}
