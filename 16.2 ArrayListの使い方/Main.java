// イテレータを使ったArrayListの繰り返し処理
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("管原");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}
