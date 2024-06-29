public class SuperHero extends Hero {
  // boolean flying;
  // public void fly() {
  //   this.flying = true;
  //   System.out.println("飛び上がった！");
  // }
  // public void land() {
  //   this.flying = false;
  //   System.out.println("着地した！");
  // }
  // /* オーバーライド */

  // // SuperHeroクラスにrun()を再定義する
  // public void run() {
  //   System.out.println(this.name + "は撤退した");
  // }
  
  // // 親クラスのattack()を呼び出す
  // public void attack(Matango m) {
  //   super.attack(m);
  //   if (this.flying) {
  //     super.attack(m);
  //   } 
  // }
  public SuperHero() {
    Super();
    System.out.println("SuperHeroのコンストラクタが動作");
  }
} 
