/* 引数に配列を受け取るメソッド */
public class Main {
  // // int型配列を受け取り、すべての要素を表示するメソッド
  // public static void printArray(int[] array) {
  //   for (int element : array) {
  //     System.out.println(element);
  //   }
  // }
  // public static void main(String[] args) {
  //   int[] array = {1, 2, 3};
  //   printArray(array); // 配列を渡す
  // }

  // 同じ配列を参照している状態を確認する
  
  // int型配列を受け取り、
  // 配列内の要素すべてに1を加えるメソッド
  // public static void incArray(int[] array) {
  //   for (int i = 0; i < array.length; i++) {
  //     array[i]++;
  //   }
  // }
  // public static void main(Static[] args) {
  //   int[] array = {1, 2, 3};
  //   incArray(array);
  //   for (int i : array) {
  //     System.out.println(i);
  //   }
  // }

  /* 戻り値に配列を用いる */
  // 戻り値が配列の場合
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
  public static void main(String[] args) {
    int[] array = makeArray(3);
    for (int i : array) {
      System.out.println(i);
    }
  }
}
