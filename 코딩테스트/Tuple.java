public final class Tuple<L, R> {
  public L left;
  public R right;

  public Pair(L left, R right) {
    this.left = left;
    this.right = right;
  }

  public static <L, R> Pair<L, R> of(L left, R right) {
    return new Pair<L, R>(left, right);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Pair)) {
      return false;
    }

    Pair obj = (Pair) o;
    return this.left.equals(obj.left) && this.right.equals(obj.right);
  }
}
