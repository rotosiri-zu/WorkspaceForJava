public class Main {
  public static void main(String[] args) {
    // int age = 20;
    // System.out.println("私の年齢は" + age);
    // age = 31;
    // System.out.println("...いや、本当の年齢は" + age);
    // System.out.println("私の好きな記号は二重引用符(\")です");
    
    /* テキストブロック */
    // """
      
    // """;

    /* 大きい方の数値を代入する命令 */
    // int a = 5;
    // int b = 3;
    // int m = Math.max(a, b);
    // System.out.println("比較実験:" + a + "と" + b + "とで大きいほうは・・・" + m);

    /* 文字列を整数に変換する命令 */
    // String age = "31";
    // int n = Integer.parseInt(age);
    // System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");

    /* 乱数を生み出して代入する命令 */
    // int r = new java.util.Random().nextInt(90);
    // System.out.println("あなたはたぶん、" + r + "歳ですね？");

    /* キーボードから1行の入力を受け取る命令 */
    // System.out.println("あなたの名前を入力してください。");
    // String name = new java.util.Scanner(System.in).nextLine();
    // System.out.println("あなたの年齢を入力してください。");
    // int age = new java.util.Scanner(System.in).nextInt();
    // System.out.println("ようこそ、" + age + "歳の" + name + "さん");

    /* 練習問題 */
    // int x = 5;
    // int y = 10;
    // String ans = "x+yは" + (x + y);
    // System.out.println(ans);

    /* 条件分岐 */
    // boolean tenki == true;
    // if (tenki == true) {
    //   System.out.println("洗濯をします");
    //   System.out.println("さんぽにいきます");
    // } else {
    //   System.out.println("映画を見ます");
    // }
    
    /* 繰り返し処理 */
    // boolean doorClose = true;
    // while (doorClose == true) {
    //   System.out.println("ノックする");
    //   System.out.println("1分待つ");
    // }

    /* 文字列の比較 */
    // if(str.equals("スッキリ")) {

    // }

    /* 論理演算子を用意居た複雑な条件式  */
    // if(age >= 18 && month == 5) {

    // }
    // if(name.equals("斎藤") || name.equals("斎藤")) {

    // }
    // if((hp < 100 && poison == false) || (hp < 100 && poison == true)) {

    // }
    // if(!age == 10) {
      
    // }

    /* 3種類のif構文 */
    // if ( age >= 20) {
    //   canDrink = true;
    // } else {
    //   canDrink = false;
    // }

    // if ( age >= 20) {
    //   canDrink = true;
    // }

    // if ( height >= 170 ) {
    //   size = 'L';
    // } else if (height >= 155) {
    //   size = 'N';
    // } else if (height >= 140) {
    //   size = 'S';
    // } else {
    //   size = '?';
    // }

    // /* switch文による分岐 */
    // switch (fortune) {
    //   case 1 -> {
    //     System.out.println("大吉");
    //   }
    //   case 2 -> {
    //     System.out.println("中吉");
    //   }
    //   case 3 -> {
    //     System.out.println("吉");
    //   }
    //   default -> {
    //     System.out.println("凶");
    //   }
    // }

    /* case文に複数の値を指定する */
    // System.out.println("あなたの運勢を占います");
    // int fortune = new java.util.Random().nextInt(5) + 1;
    // switch (fortune) {
    //   case 1, 2 -> {
    //     System.out.println("いいね！");
    //   }
    //   case 3 -> {
    //     System.out.println("普通です");
    //   }
    //   case 4, 5 -> {
    //     System.out.println("うーん...");
    //   }
    // }

    /* 伝統的なswitch文 */
    // System.out.println("あなたの運勢を占います");
    // int fortune = new java.util.Random().nextInt(5) + 1;
    // switch (fortune) {
    //   case 1, 2: {
    //     System.out.println("いいね！");
    //     break;
    //   }
    //   case 3: {
    //     System.out.println("普通です");
    //     break;
    //   }
    //   case 4, 5: {
    //     System.out.println("うーん...");
    //   }
    // }

    /* 式としても利用できるswitch文 */
    // String s = switch(fortune) {
    //   case 1 -> "大吉";
    //   case 2 -> "中吉";
    //   case 3 -> "吉";
    //   default -> "凶";
    // };
    // System.out.println("運勢は" + s);

    /* 分岐が2つの場合は、三項条件演算子で同様の処理を手軽に実現 */
    // String s = age >= 18 ? "成人" : "未成年";

    /* 2種類のwhile文 */
    // while (temp > 25) {
    //   temp--;
    //   System.out.println
    //     ("温度を1度下げました");
    // }

    // do {
    //   temp--;
    //   System.out.println
    //     ("温度を1度下げました");
    // } while (temp > 25);

    // do-while文 ブロックが最低1回は実行される
    // while ブロックが実行されないことがある

    /* for文による繰り返し */
    // for (int i = 0; i < 10; i++) {
    //   System.out.println("こんにちは");
    // }

    // for (int i = 0; i < 3; i++) {
    //   System.out.print("現在" + (i + 1) + "週目→");
    // }

    // /* 複雑なfor文 */
    // // ループ変数を1からスタート
    // for (int i = 1; i < 10; i++) {}
    // // ループ変数を2ずつ増やす
    // for (int i = 0; i < 10; i += 2) {}
    // // ループ変数を10から1ずつ1まで減らしていく
    // for (int i = 10; i > 0; i--) {}
    // // ループ変数を初期化しない
    // for (; i < 10; i++) {}
    // // 繰り返し時の処理を行わない
    // for (int i = 0; i < 10;) {}

    /* 複雑なfor文をあえて避ける */
    // for (int i = 0; i < 10; i++) {
    //   int j = i * 2;
    //   /* ここでjを使った処理 */
    // }

    /* 制御構造のネスト */
    // for (int i = 1; i < 10; i++) {
    //   for (int j = 1; j < 10; j++) {
    //     System.out.print(i * j); // 掛け算の結果を出力
    //     System.out.print(" "); // 空白を出力
    //   }
    //   System.out.println(""); // 改行を出力
    // }

    /* 繰り返しの中断 */
    // for (int i = 1; i < 10; i++) {
    //   if (i == 3) {
    //     break;
    //   }
    //   System.out.println(i);
    // }
    // for (int i = 1; i < 10; i++) {
    //   if (i == 3) {
    //     continue;
    //   }
    //   System.out.println(i);
    // }

    /* 配列の作成 */
    // int [] scores = new int[5];
    
    /* 配列の長さを調べる */
    // int [] scores = new int[5];
    // int num = scores.length;
    // System.put.println("要素の数:" + num);
    // int [] scores = new int[5];
    // int num = scores.length;
    // System.put.println("要素の数:" + num);
    
    /* 配列の要素に値を代入 */
    // int [] scores; 
    // scores = new int[5];
    // scores[1] = 30;
    // System.put.println("要素の数:" + num);
    
    /* 配列は自動的に初期化される */
    // int[] scores = new int[5];
    // System.out.println(scores[0]);

    /* 省略記法 */
    // int[] scores1 = new int[] {20, 30, 40, 50, 80}; // 省略記法①
    // int[] scores1 = {20, 30, 40, 50, 80}; // 省略記法②
  }
}

/* 整数を格納できる4つの型 (byte、short、int、long) */
// byte glasses;
// glasses = 2;
// short age;
// age = 18;
// int salary;
// salary = 152000;
// long worldPeople;
// worldPeople = 6900000000L;

/* 小数を格納できる2つの型 (float、double) */
// float weight;
// weight = 67.5F;
// double height;
// height = 171.2;

/* YESかNOかを格納できるboolean型 */
// boolean isError; isError = true;
// boolean result; result = false;

/* 1文字だけを格納できるchar型、文字列を格納できるString型 */
// char zodiac;
// zodiac = '辰'
// String name;
// name = 'すがわら'

/* 変数の初期化 */
// int age;
// age = 22;

/* 値を書き換えられたくない場合は finalを変数名の前に付けて定数にする  */

// final double PI = 3.14;
