public class Main {
  public static void main(String[] args) {
    // String s1 = "スッキリJava";
    // String s2 = "Java";
    // String s3 = "Java";
    // if (s2.equals(s3)) {
    //   System.out.println("s2とs3は等しい");
    // }
    // if (s2.equalsIgnoreCase(s3)) {
    //   System.out.println("s2とs3はケースを区別しなければ等しい");
    // }
    // System.out.println("s1の長さは" + s1.length() + "です");
    // if (s1.isEmpty()) {
    //   System.out.println("s1は空文字です");
    // }

    // 文字列検索メソッドを利用する
    // String s1 = "Java and JavaScript";
    // if (s1.contains("Java")) {
    //   System.out.println("文字列s1は、Javaを含んでいます");
    // }
    // if (s1.endswith("Java")) {
    //   System.out.println("文字列s1は、Javaが末尾にあります");
    // }
    // System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    // System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

    // 文字列切り出しメソッドを利用する
    String s1 = "Java programming";
    System.out.println("文字列s1の4文字目以後は" + s1.substring(3)); // a programming
    System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));
  }
}
