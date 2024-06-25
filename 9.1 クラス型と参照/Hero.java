public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }

  // 生まれた直後の動作を定義したHeroクラス
  // コンストラクタで引数を追加情報として受け取る
  // コンストラクタのオーバーロード
  // 別のコンストラクタを呼び出す
  public Hero(String name) { // コンストラクタ①
    this.hp = 100; // hpフィールドを100で初期化
    this.name = name; // 引数の値でnameフィールドを初期化
  }
  public Hero() { // コンストラクタ②
    // this.hp = 100;
    // this.name = "ダミー";
    this("ダミー");
  }
}
