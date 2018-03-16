import Product.Product;

public interface ListMenu<T> {
    T addElement();
    T updateElement(Product product);
}
