// 例外処理を用意してないとコンパイルエラー
import java.io.*;

public class Main {
  public static void main(String[] args) {
    // try-catch文でEXception系例外の発生に備える
    try {
      FileWriter fw = new FileWriter("date.txt");
    } catch(IOException e) {
      System.out.println("エラーが発生しました。");
    }
  }
}
