public interface ShoppingCartVisitor {
  int visit(Fruit fruit);
  int visit(Book book);
  int visit(NoteBook notebook);
}
