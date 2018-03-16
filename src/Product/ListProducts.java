package Product;
import java.util.ArrayList;
import java.util.List;

public class ListProducts<T> {

    private List<T> list;

    public ListProducts() {
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void printListProduct(){
        int index = 1;
        for (Object listProducts : list){
            System.out.println((index++) + ". " + listProducts);
        }
    }

}
