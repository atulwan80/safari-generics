package shopping;

import java.time.LocalDate;

public class Store {
  public static void main(String[] args) {
//    Pair<String> p = new Pair<String>("Fred", LocalDate.now());
    Pair<String> p = new Pair<>("Fred", "Jones");
//    p.setRight(LocalDate.now());
//    String right = p.getRight();
//    System.out.println(p.getLeft());

    ClothingPair<Shoe> ps = new ClothingPair<>(new Shoe(44, "Brown"), new Shoe(45, "Brown"));

    System.out.println("Pair matches? " + ps.isMatched());

    ClothingPair<Shoe> ps2 = new ClothingPair<>(new Shoe(45, "Brown"), new Shoe(45, "Brown"));

    System.out.println("Pair 2 matches? " + ps2.isMatched());

  }
}
