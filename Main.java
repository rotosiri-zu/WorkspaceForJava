public class Main {
  public static void main(String[] args) {
    int age = 20;
    System.out.println("私の年齢は" + age);
    age = 31;
    System.out.println("...いや、本当の年齢は" + age);
  }
}

/* 整数を格納できる4つの型 (byte、short、int、long) */
byte glasses;
glasses = 2;
short age;
age = 18;
int salary;
salary = 152000;
long worldPeople;
worldPeople = 6900000000L;

/* 小数を格納できる2つの型 (float、double) */
float weight;
weight = 67.5F;
double height;
height = 171.2;

/* YESかNOかを格納できるboolean型 */
boolean isError; isError = true;
boolean result; result = false;

/* 1文字だけを格納できるchar型、文字列を格納できるString型 */
char zodiac;
zodiac = '辰'
String name;
name = 'すがわら'

/* 変数の初期化 */
int age;
age = 22;

/* 値を書き換えられたくない場合は finalを変数名の前に付けて定数にする  */

final double PI = 3.14;
