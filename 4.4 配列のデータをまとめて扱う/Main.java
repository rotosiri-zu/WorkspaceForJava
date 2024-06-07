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
    // int[] scores = {20, 30, 40, 50, 80};
    // int count = 0;
    // for (int i = 0; i < scores.length; i++) {
    //   if (scores[i] >= 50) {
    //     count++;
    //   }
    // }
    // System.out.println("50点以上の科目の数は:" + count);

    /* DNAの記号をランダムに表示する */

    // int[] seq = new int[10];

    // // 塩基配列をランダムに生成
    // for (int i = 0; i < seq.length; i++) {
    //   seq[i] = new java.util.Random().nextInt(4);
    // }

    // // 生成した塩基配列の記号を表示
    // for (int i = 0; i < seq.length; i++) {
    //   char[] base = {'A', 'T', 'G', 'C'};
    //   System.out.print(base[seq[i]] + " ");
    //   }

    //   int baseType = seq[i]; // 1番目の数値を取得
    //   char baseChar = base[baseType]; // 数値に対する記号を取得
    //   System.out.print(baseChar + " "); // 記号を画面に表示

      /* 拡張for文 */
      int[] scores = {20, 30, 40, 50, 80};
      for (int value : scores) {
        System.out.println(value);
      }
    }
  }
}
