// 静的フィールドmoneyへのアクセス
// インスタンスから静的フィールドを利用する
public class Main {
  public static void main(String[] args) {
    // Hero h1 = new Hero();
    // Hero h2 = new Hero();
    // newしなくても静的フィールドは利用できる
    // Hero.money = 100;
    // System.out.println(h1.hp);
    // System.out.println(Hero.money);
    // h1.money = 300;
    // System.out.println(h2.money);

    // newしなくても静的メソッドは呼び出せる
    Hero.setRandomMoney();
    System.out.println(Hero.money);
    Hero h1 = new Hero();
    System.out.println(h1.money);
  }
}
