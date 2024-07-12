// Wizardクラスを通常の方法でインスタンス化
// public class Main {
//   public static void main(String[] args) {
//     WIzard w = new Wizard();
//     Matango m = new Matango();
//     w.name = "アサカ";
//     w.attack(m);
//     w.fireball(m);
//   }
// }

// MonsterとSlimeの逃げ方を調べる
public class Main {
  public static void main(String[] args) {
    Slime s = new Slime();
    Monster m = new Slime();
    s.run(); m.run();
  }
}
