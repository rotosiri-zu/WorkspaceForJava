/* シンプルなメソッドの定義 */
public class Main {
  /* mainメソッド以外からのメソッドの呼び出し */
  public static void methodA() {
    System.out.println("methodA");
    methodB();
  }
  public static void methodB() {
    System.out.println("methodB");
  }

  public static void main(String[] args) {
    /* メソッドの呼び出し */
    // System.out.println("メソッドを呼び出します。");
    // hello();
    // System.out.println("メソッドの呼び出しが終わりました");
    methodA();
  }
  // public static void hello() {
  // System.out.println("湊さん、こんにちは");
  // }

}
