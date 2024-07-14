// 多態性と配列を組み合わせて宿屋に泊まる
// public class Main {
//   public static void main(String[] args) {
//     Character[] c = new Character[5];
//     c[0] = new Hero();
//     c[1] = new Hero();
//     c[2] = new Thief();
//     c[3] = new Wizard();
//     c[4] = new Wizard();
//     // 宿屋に泊まる
//     for (Character ch : c) {
//       ch.hp += 50;
//     }
//   }
// }

// 同じ指示で異なる動作をさせることができる
public class Main {
  public static void main(String[] args) {
  Monster[] Monsters = new Monster[3];
  monsters[0] = new Slime();
  monsters[1] = new Goblin();
  monsters[2] = new DeathBBat();
  for (Monster m : monsters) {
    m.run();
    }
  }
}
