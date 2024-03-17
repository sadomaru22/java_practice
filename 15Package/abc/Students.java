package abc;

public class Students {
   public int no;
   public String name;

   public Students(int no, String name) {
      this.no = no;
      this.name = name;
   }

   void showInfo() {
      System.out.println("No." + no + ", 名前：" + name);
   }

   String toString(int no, String name) {
      System.out.println("No." + no + ", 名前：" + name);
   }
}
