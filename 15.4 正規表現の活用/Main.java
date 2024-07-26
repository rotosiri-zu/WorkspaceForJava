// splitメソッドを使った文字列の分割
public class Main {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words) {
      System.out.print(w + "->");
    }
    // replaceAllメソッドを使った文字列の置換
    String w = s.replaceAll("[beh]", "x");
    System.out.println(w); // axc,dxf:gxi
  }
  // 文字列パターンを用いたプレイヤー名のチェック
  public boolean isvalidPlayerName(String name) {
    return name.matches("[A-Z][A-Z0-9]{7}");
  }
}