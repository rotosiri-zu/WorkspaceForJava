// Heroクラスの文字情報を表示する
public class Hero {
  String name;
  int hp;

  // 意図する文字列表現を返すtoString()を定義
  // public String toString() {
  //   return "名前:" + this.name + "/HP:" + this.hp;
  // }

  // 名前が同じなら同じ勇者とするequals()を定義
  public boolean equals(Object o) {
    if (this == 0) { return true; }
    if (o instanceof Hero h) {
      if (this.name.equals(h.name)) {
        return true;
      }
    }
    return false;
  }
}
