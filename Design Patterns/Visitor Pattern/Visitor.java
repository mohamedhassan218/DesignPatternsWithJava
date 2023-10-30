public class Visitor implements ShoppingCartVisitor {

  @Override
  public int visit(Book book) {
    int cost = 0;
    cost = book.getPrice();
    System.out.println("Book name: " + book.getName() + '.');
    return cost;
  }

  @Override
  public int visit(Fruit fruit) {
    int cost = 0;
    cost = fruit.getPrice() * fruit.getWeight();
    System.out.println("Fruit weight: " + fruit.getWeight() + "Kg.");
    return cost;
  }

  @Override
  public int visit(NoteBook notebook) {
    int cost = 0;
    cost = notebook.getPrice();
    System.out.println("NoteBook size: " + notebook.getSize() + '.');
    return cost;
  }
}
