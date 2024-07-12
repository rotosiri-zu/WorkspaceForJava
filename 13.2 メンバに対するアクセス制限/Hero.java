// hpフィールドをprivateにしたHeroクラス
public class Hero {
  private int hp;
  String name;
  Sword sword;
  :
  // dieメソッドをprivateにする
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです。");
  }
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }
  // attackメソッドはpublicにする
  public void attack(Matango m) {
    :
  }
  :
}
