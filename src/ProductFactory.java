import Product.*;

import java.util.List;
import java.util.Scanner;

public class ProductFactory<T> implements ListMenu<T>{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public T addElement() {
        System.out.println("Создать: computer(введите \"c\") или printer(введите \"p\")");
        String item = scanner.next();
        switch (item){
            case "c":{
                return (T)createComp();
            }
            case "p":{
                return (T)createPrinter();
            }
            default:{
                System.out.println("Неправильный ввод");
                break;
            }
        }
        return null;
    }

    @Override
    public T updateElement(Product product) {
        if (product.getName().equals(String.valueOf(EnumProducts.COMPUTER))){
            return toChangeComp(product);
        }else if (product.getName().equals(String.valueOf(EnumProducts.PRINTER))){
            return toChangePrinter(product);
        }else
        return null;
    }

    public Computer createComp(){
        String name = String.valueOf(EnumProducts.COMPUTER);
        System.out.println("Введите модель: ");
        String model = scanner.next();
        System.out.println("цена: ");
        int price = Integer.valueOf(scanner.next());
        System.out.println("процессор: ");
        String processor = scanner.next();
        System.out.println("объем памяти: ");
        int memorySize = Integer.valueOf(scanner.next());
        return new Computer(name, model, price, processor, memorySize);
    }

    public Printer createPrinter(){
        String name = String.valueOf(EnumProducts.PRINTER);
        System.out.println("Введите модель: ");
        String model = scanner.next();
        System.out.println("цена: ");
        int price = Integer.valueOf(scanner.next());
        System.out.println("скорость печати: ");
        int speedPrint = Integer.valueOf(scanner.next());
        System.out.println("разрешение печати принетера: ");
        int resolutionPrint = Integer.valueOf(scanner.next());
        return new Printer(name, model, price, speedPrint, resolutionPrint);
    }

    public T toChangeComp(Product product){
        Computer computer = (Computer)product;
        System.out.println(computer.getName());
        System.out.println("Изменить модель:");
        computer.setModel(scanner.next());
        System.out.println("цена:");
        computer.setPrice(Integer.valueOf(scanner.next()));
        System.out.println("процессор: ");
        computer.setProcessor(scanner.next());
        System.out.println("объем памяти: ");
        computer.setMemorySize(Integer.valueOf(scanner.next()));
        return (T)computer;
    }

    public T toChangePrinter(Product product){
        Printer printer = (Printer)product;
        System.out.println(printer.getName());
        System.out.println("Изменить модель: ");
        printer.setModel(scanner.next());
        System.out.println("цена: ");
        printer.setPrice(Integer.valueOf(scanner.next()));
        System.out.println("скорость печати: ");
        printer.setSpeedPrint(Integer.valueOf(scanner.next()));
        System.out.println("разрешение печати принетера: ");
        printer.setResolutionPrint(Integer.valueOf(scanner.next()));
        return (T)printer;
    }

}
