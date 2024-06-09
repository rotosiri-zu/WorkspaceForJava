/* 戻り値の例 */
public class Main {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    int ans = add(100, 10);
    // System.out.println("100 + 10 =" + ans);

    /* 戻り値をそのまま使う */
    System.out.println(add(add(10, 20), add(30, 40)));

    /* return文の注意点 */

    // return文の後に処理は書けない (エラー)

    return 1;
    int x = 10; // この文は実行されないのでコンパイルエラーになる
  }
}
