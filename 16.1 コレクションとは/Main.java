// ラッパークラスをArrayListに格納する
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);
    for (int i : points) {
      System.out.println(i);
    }

    // 明示的に基本型とラッパークラスを変換したい場合
    Integer i1 = Integer.valueOf(16);
    int i2 = i1.intValue();
  }
}
