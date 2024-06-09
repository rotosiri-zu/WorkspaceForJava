public class Main {
  public static void main(String[] args) {
    /* 引数を1つだけ渡す */
    System.out.println("メソッドを呼び出します");
    hello("湊");
    hello("朝香");
    hello("管原");  
    System.out.println("メソッドを呼び出しが終わりました");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }

  /* 複数の引数を渡す */
  add(100, 20);
  add(200, 50);

  // 複数の値を受け取るaddメソッド
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}
