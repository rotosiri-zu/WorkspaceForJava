/* for文を使って配列を扱う */
public class Main {
  public static void main(String[] args) {
    // int[] scores = {20, 30, 40, 50, 80};
    // for (int i = 0; i < scores.length; i++) {
    //   System.out.println(scores[i]);
    // }

    /* パターン2 ループによる集計 */
    // 点数管理プログラム
    // int[] scores = {20, 30, 40, 50, 80};
    // int sum = 0;
    // for (int i = 0; i < scores.length; i++) {
    //   sum += scores[i];
    // }
    // int avg = sum / scores.length;
    // System.out.println("合計点:" + sum);
    // System.out.println("平均点:" + avg);

    // 50点以上の科目の数を調べる
    int[] scores = {20, 30, 40, 50, 80};
    int count = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目の数は:" + count);
  }
}
