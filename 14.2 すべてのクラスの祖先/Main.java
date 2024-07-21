// 何も定義してないクラスでtoString()を呼ぶ
// Heroクラスの文字情報を表示する
public class Main {
  public static void main(String[] args) {
    // Empty e = new Empty();
    // String s = e.toString();
    // System.out.println(s);

    // Object型にさまざまなインスタンスを代入
    // Object o1 = new Empty();
    // Object o2 = new Hero();
    // Object o3 = new "こんにちは";

    // 2人の勇者を比較する
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    System.out.println(h.toString());
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }
  }
}
