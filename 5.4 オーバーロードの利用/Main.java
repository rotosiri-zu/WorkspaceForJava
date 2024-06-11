/* オーバーロード(引数の型が異なる場合) */
public class Main {
  // // 1つ目のaddメソッド
  // public static int add(int x, int y) {
  //   return x + y;
  // }
  // // 2つ目のaddメソッド
  // public static double add(double x, double y) {
  //   return x + y;
  // }
  // // 3つ目のaddメソッド
  // public static string add(string x, string y) {
  //   return x + y;
  // }
  // public static void main(String[] args) {
  //   System.out.println(add(10, 20));

  //   System.out.println(add(3.5, 2.7));

  //   System.out.println(add("Hello", "world"));
  // }

  /* オーバーロード (引数の数が異なる場合) */
  public static int add(int x, int y) { 
    return x + y;
  }
  public static int add(int x, int y, int z) {
    return x + y + z;
  }
  public static void main(string[] args) {
    System.out.println("10+20=" + add(10, 20));
    System.out.println("10+20+30=" + add(10, 20, 30));
  }
}
