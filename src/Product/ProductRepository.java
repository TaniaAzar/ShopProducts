package Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository<T extends Comparable<T>> implements Repository {

    private List<T> list;

    public ProductRepository() {
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void printListProduct(){
        int index = 1;
        for (Object listProducts : list){
            System.out.println((index++) + ". " + listProducts);
        }
    }

    public void toSortListProduct(){
        Collections.sort(list);
        int index = 1;
        for (Object listProducts : list){
            System.out.println((index++) + ". " + listProducts);
        }
    }

    public void theAverageCostOfGoods(){
        int result = 0;
        List<Product> products = (List<Product>) list;
        for (Product product : products){
            result += product.getPrice();
        }
        System.out.println("Средняя стоимость товаров = " + result / list.size());
    }
}
