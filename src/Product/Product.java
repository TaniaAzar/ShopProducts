package Product;

public abstract class Product{

    private String name;
    private String model;
    private int price;

    public Product(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Product product = (Product) object;

        if (price != product.price) return false;
        if (!name.equals(product.name)) return false;
        return model.equals(product.model);
    }

    @Override
    public String toString() {
        return "Product.Product{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", price=" + price +
                '}';
    }
}
