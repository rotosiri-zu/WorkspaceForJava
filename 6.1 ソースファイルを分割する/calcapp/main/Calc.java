// clacapp.logics.CalcLogicをインポートする
package calcapp.main;
// import clacapp.logics.CalcLogic;
import clacapp.logics.CalcLogics.*;

public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    int delta = calcapp.logics.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
