package Product;

import Product.Product;

public class Printer extends Product {

    private int speedPrint;
    private int resolutionPrint;

    public Printer(String name, String model, int price, int speedPrint, int resolutionPrint) {
        super(name, model, price);
        this.speedPrint = speedPrint;
        this.resolutionPrint = resolutionPrint;
    }

    public int getSpeedPrint() {
        return speedPrint;
    }
    public void setSpeedPrint(int speedPrint) {
        this.speedPrint = speedPrint;
    }
    public int getResolutionPrint() {
        return resolutionPrint;
    }
    public void setResolutionPrint(int resolutionPrint) {
        this.resolutionPrint = resolutionPrint;
    }

    @Override
    public String toString() {
        return getName() +
                ", модель: " + getModel() +
                ", цена:  " + getPrice() +
                ", скорость печати: " + speedPrint +
                ", разрешение печати: " + resolutionPrint;
    }
}
