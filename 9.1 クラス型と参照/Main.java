public class Main {
  public static void main(String[] args) {
    
    
    // 剣を装備した勇者を生み出す
    // Sword s = new Sword;
    // s.name = "炎の剣";
    // s.damage = 10;
    // Hero h = new Hero();
    // h.name = "ミナト";
    // h.hp = 100;
    // h.sword = s;
    // System.out.println("現在の武器は" + h.sword.name);
    
    // 勇者と魔法使いを生み出す (抜粋)
    // Hero h1 = new Hero();
    // h1.name = "ミナト";
    // h1.hp = 100;
    // Hero h2 = new Hero();
    // h2.name = "アサカ";
    // h2.hp = 100;
    // Wizard w = new wizard();
    // w.name = "スガワラ";
    // w.hp = 50;
    // w.heal(h1); // ミナトを回復させる (HP: 100 → 110)
    // w.heal(h2); // アサカを回復させる (HP: 100 → 110)
    // w.heal(h2); // アサカを回復させる (HP: 110 → 120)
    
    // コンストラクタが定義されたHeroを生み出す
    // newで引数を渡す
    // Hero h = new Hero("ミナト");
    
    // System.out.println(h.hp);
    // System.out.println(h.name);

    // コンストラクタをオーバーロードしたクラスの利用
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    Hero h2 = new Hero();
    System.out.println(h2.name);
  }
}
