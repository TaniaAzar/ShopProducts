package Product;

public class Computer extends Product{

    private String processor;
    private int memorySize;

    public Computer(String name, String model, int price, String processor, int memorySize) {
        super(name, model, price);
        this.processor = processor;
        this.memorySize = memorySize;
    }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getMemorySize() {
        return memorySize;
    }
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return getName() +
                ", модель: " + getModel() +
                ", цена:  " + getPrice() +
                ", процессор: " + processor +
                ", объем памяти: " + memorySize;
    }
}
