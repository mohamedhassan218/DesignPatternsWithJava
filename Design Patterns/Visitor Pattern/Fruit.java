public class Fruit implements Element {

  private int weight;
  private int price;

  public Fruit(int weight, int price) {
    this.weight = weight;
    this.price = price;
  }

  public int getWeight() {
    return weight;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
