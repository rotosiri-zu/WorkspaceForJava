/* ガベージコレクション */
public class Main {
  public static void main(String[] args) {
    boolean judge = true;
    if ( judge == true ) {
      int[] array = {1, 2, 3};
    }
    /* null */
    int[] array = {1, 2, 3};
    array = null;
    array[0] = 10;
  }
}
