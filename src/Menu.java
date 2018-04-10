import Product.*;

import java.util.*;

public class Menu<T extends Comparable<T>> {

    private ProductRepository<T> repository = new ProductRepository<T>();
    private ProductFactory<T> factory = new ProductFactory<T>();

    Scanner scanner = new Scanner(System.in);
    int item;

    public void showMainMenu(){
        do {
            showMenu();
            item = Integer.valueOf(scanner.next());
            switch (item){
                case 1: {
                    repository.getList().add((T) factory.addElement());
                    break;
                }
                case 2:{
                    if (repository.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        System.out.println("Выберите товар для изменения:");
                        repository.printListProduct();
                        int i = Integer.valueOf(scanner.next());
                        factory.updateElement((Product)repository.getList().get(i-1));
                        System.out.println("Товар изменен");
                    }
                    break;
                }
                case 3:{
                    if (repository.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        System.out.println("Выберите товар для удаления:");
                        repository.printListProduct();
                        int i = Integer.valueOf(scanner.next());
                        repository.getList().remove(repository.getList().get(i-1));
                        System.out.println("Товар удален");
                    }break;
                }
                case 4:{
                    if (repository.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        repository.printListProduct();
                    }
                    break;
                }
                case 5:{
                    if (repository.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        repository.toSortListProduct();
                    }
                    break;
                }
                case 6:{
                    if (repository.getList().isEmpty()){
                        System.out.println("Товаров в базе нет");
                    }else {
                        repository.theAverageCostOfGoods();
                    }
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
                "5 - to sort by a name\n" +
                "6 - to learn the average cost of goods\n" +
                "7 - save to file\n" +
                "8 - load from file\n" +
                "0 - exit");
    }
}
