package generics;

public class Tuple <T> {
  private final T left;
  private final T right;


  public Tuple(final T left, final T  right) {
    this.left = left;
    this.right = right;
  }

  public T getLeft() {
    return left;
  }

  public T getRight() {
    return right;
  }



}
