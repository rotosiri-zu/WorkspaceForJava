// List<String>型なら、どんなリストでも受け取れる
public class Main {
  public static void printList(ArrayList<String> list) {
    for (String s : list) {
      System.out.println(s);
    }
  }
}
