public class NoteBook implements Element {

  private String size;
  private int price;

  public NoteBook(String size, int price) {
    this.size = size;
    this.price = price;
  }

  public String getSize() {
    return size;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
