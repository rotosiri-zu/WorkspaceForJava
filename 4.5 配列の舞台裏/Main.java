/* 配列を理解する */
public class Main {
  public static void main(String[] args) {
    int[] arrayA = {1, 2, 3}; 
    int[] arrayB;
    arrayB = arrayA; // arrayBにarrayAを代入
    arrayB[0] = 100; // arrayBの0番目に100を代入
    System.out.println(arrayA[0]); // 出力結果100
  }
}
