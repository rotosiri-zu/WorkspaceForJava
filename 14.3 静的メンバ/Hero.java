// 各インスタンスのフィールドは独立している
public class Hero {
  String name;
  int hp;
  // staticによるフィールドの共有
  static int money;

  // 所持金をランダムに設定する
  public static void setRandomMoney() {
    Hero.money = (int)(Math.random() * 1000);
    // 静的メソッドから非静的メンバを利用(エラー)
    System.out.println(this.name + "たちの所持金を初期化しました");
  }
}
