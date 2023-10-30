public class ShoppingCartClient {

  public static void main(String[] args) {
    Element[] items = new Element[] {
      new Book("1234", 20),
      new Book("5678", 55),
      new Fruit(10, 2),
      new Fruit(5, 5),
      new NoteBook("12 x 20", 10),
      new NoteBook("20 x 35", 25),
    };

    int total = calculatePrice(items);
    System.out.println("Total Cost = " + total);
  }

  private static int calculatePrice(Element[] items) {
    Visitor visitor = new Visitor();
    int sum = 0;
    for (Element item : items) {
      sum = sum + item.accept(visitor);
    }
    return sum;
  }
}
