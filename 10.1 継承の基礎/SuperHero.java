public class SuperHero extends Hero {
  boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
  /* オーバーライド */

  // SuperHeroクラスにrun()を再定義する
  public void run() {
    System.out.println(this.name + "は撤退した");
  }
} 
