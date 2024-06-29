public class Weapon extends Item {
  // 内部インスタンスのコンストラクタ引数を指定する 
  /* 内部インスタンスの初期化を行うコンストラクタ(Item()コンストラクタ)に引数を与える必要がある場合は、
  super()の呼び出しで明示的に引数を渡す */
  
  public Weapon() {
    Super("ななしの剣");
  }
}
