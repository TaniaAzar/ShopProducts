import Product.*;
import java.util.Scanner;

public class Menu<T> {

    private ListProducts<T> listProducts = new ListProducts<T>();
    private ProductFactory<T> factory = new ProductFactory<T>();

    Scanner scanner = new Scanner(System.in);
    int item;

    public void showMainMenu(){
        do {
            showMenu();
            item = Integer.valueOf(scanner.next());
            switch (item){
                case 1: {
                    listProducts.getList().add((T) factory.addElement());
                    break;
                }
                case 2:{
                    if (listProducts.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        System.out.println("Выберите товар для изменения:");
                        listProducts.printListProduct();
                        int i = Integer.valueOf(scanner.next());
                        factory.updateElement((Product)listProducts.getList().get(i-1));
                        System.out.println("Товар изменен");
                    }
                    break;
                }
                case 3:{
                    if (listProducts.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        System.out.println("Выберите товар для удаления:");
                        listProducts.printListProduct();
                        int i = Integer.valueOf(scanner.next());
                        listProducts.getList().remove(listProducts.getList().get(i-1));
                        System.out.println("Товар удален");
                    }break;
                }
                case 4:{
                    if (listProducts.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        listProducts.printListProduct();
                    }
                    break;
                }
                case 5:{

                    break;
                }
            }
        }while (item != 0);
    }

    public static void showMenu(){
        System.out.println("Выберете необходимый пункт меню: \n" +
                "1 - add element\n" +
                "2 - update element\n" +
                "3 - delete element\n" +
                "4 - print all\n" +
                "5 - save to file\n" +
                "6 - load from file\n" +
                "0 - exit");
    }
}
