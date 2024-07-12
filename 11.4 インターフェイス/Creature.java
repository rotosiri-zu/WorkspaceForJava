// 抽象度の高いCreatureクラス
public abstract class Creature {
  public abstract void run();
}

// インタフェースとして宣言したCreature
public interface Creature {
  public abstract void run();
}

// 一般的な書き方をしたインタフェース
public interface Creature {
  void run();
}

// インタフェースにおける定数宣言
public interface Circle {
  double PI = 3.141592;
}
