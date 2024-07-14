// 王様クラスで利用されるnameフィールド
// talk()でgetName()を呼び出す
public class King {
  void talk(Hero h) {
    System.out.println("ようこそ我が国へ、勇者" + h.getName() + "よ。");
  }
}