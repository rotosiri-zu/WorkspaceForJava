// Setに重複した値を追加しようとすると無視される
// import java.util.HashSet;
import java.util.Set;
// TreeSetから文字列を取り出すと辞書順で取り出される
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    // Set<String> colors = new HashSet<String>();
    // colors.add("赤");
    // colors.add("青");
    // colors.add("黄");
    // colors.add("赤");
    // System.out.println("色は" + colors.size() + "種類");

    // Setから要素を取り出すと順不同で取り出される
    // for (String s : colors) {
    //   System.out.println(s + "→");
    // }

    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      System.out.println(s + "→");
    }
  }
}
