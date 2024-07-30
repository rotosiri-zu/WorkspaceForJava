// オリジナル例外を定義する
public class UnsupportedMusicFileException extends Exception {
  // エラーメッセージを受け取るコンストラクタ
  public UnsupportedMusicFileException(String msg) {
    super(msg);
  }
}
