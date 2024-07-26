// 処理時間を計測する
// 現在日時を表示する

// ６つのint値とDate型の相互変換


// String型とDate型の相互変換
import java.text.SimpleDateFormat;
import java.util.Date;
// import java.util.*;

public class Main {
  public static void main(String[] args) {
    // long start = System.currentTimeMillis();
    // // ここで何らかの時間がかかる処理
    // long end = System.currentTimeMillis();
    // System.out.println("処理にかかった時間は・・・"  + (end - start) + "ミリ秒でした");
    // Date now = new Date();
    // System.out.println(now);
    // System.out.println(now.getTime());
    // Date past = new Date(1694984000000L);
    // System.out.println(past);
    // Calendar c = Calendar.getInstance();
    // 6つのint値からDateインスタンスを生成
    // c.set(2023, 8, 18, 5, 53, 20);
    // c.set(Calendar.MONTH, 9);
    // Date d = c.getTime();
    // System.out.println(d);
    // Dateインスタンスからint値を生成
    // Date now = new Date();
    // c.setTime(now);
    // int y = c.get(Calendar.YEAR);
    // System.out.println("今年は" + y + "年です");

    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // 文字列からDateインスタンスを生成
    Date d = f.parse("2023/09/18 05:53:20");
    System.out.println(d);
    // Dateインスタンスから文字列を生成
    Date now = new Date();
    String s = f.format(now);
    System.out.println("現在は" + s + "です");
  }
}
