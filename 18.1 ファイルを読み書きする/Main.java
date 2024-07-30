// ファイルから1文字ずつ読み込む
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    while (input != -1) {
      System.out.print((char)input);
      input = fr.read();
    }
    fr.close();

    // ファイルに1文字ずつ書き込む
    FileWriter fw = new FileWriter("data.txt");
    fw.write('そ');
    fw.write('れ');
    fw.write('で');
    fw.write('は');
    fw.close();
  }
}
