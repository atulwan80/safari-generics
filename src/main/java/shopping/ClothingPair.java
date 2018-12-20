package shopping;

public class ClothingPair<E extends Sized> extends Pair<E> {
  public ClothingPair(E left, E right) {
    super(left, right);
  }
  public boolean isMatched() {
    return left.getSize() == right.getSize();
  }
}
