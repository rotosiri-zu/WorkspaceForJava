public class Main {
  public static void main(String[] args) {
    // 1.勇者を作成
    Hero h = new Hero();
    // 2.フィールドに初期値をセット
    h.name = "ミナト";
    h.hp = 100;
    // System.out.println("勇者" + h.name + "を生み出しました！");

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    // 3.勇者のメソッドを呼び出してゆく
    // h.sit(5);

    // 冒険のはじまり
    h.slip();
    // h.sit(25);
    m1.run();
    m2.run();
    h.run();
  }
}
