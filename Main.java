public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");
    Monster monster = new Monster();
    System.out.println(monster.toString());
  }
}
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.deck.add(new Monster());
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

}
