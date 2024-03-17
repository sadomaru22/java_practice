import java.util.*;

public class UseMap {
   public static void main(String[] args) {
      Map<String, String> map = new HashMap<String, String>();
      map.put("A12", "山田");
      map.put("A13", "木村");
      map.put("A14", "田中");

      Set<String> keys = map.keySet();
      for (String key : keys) {
         System.out.println("社員番号：" + key);
         System.out.println("名前：" + map.get(key));
      }
   }
}
