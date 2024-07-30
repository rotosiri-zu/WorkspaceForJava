// リストに格納した変数hの勇者の名前を書き換えると変数hのnameフィールドを書き換えてしまう
import java.util.*;

class Hero {
  public String name;
}

public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    List<Hero> list = new ArrayList<Hero>();
    list.add(h);
    h.name = "スガワラ";
    System.out.println(list.get(0).name);
  }
}