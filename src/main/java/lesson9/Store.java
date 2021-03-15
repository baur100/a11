package lesson9;

public class Store {
    private String name;
    private String type;
    private int stockValue;


    // full constructor
    public Store(String name, String type, int stockValue) {
        this.name = name;
        this.type = type;
        this.stockValue = stockValue;

    }

    // default constructor
    public Store() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getStockValue() {
        return stockValue;
    }

    public void setStockValue(int stockValue) {
        this.stockValue = stockValue;
    }


    public void printStoreInfo() {

        System.out.println("The name of the store is " + name);
        System.out.println("The type of the store is " + type);
        System.out.println("The stock value of the store is " + stockValue);
    }


}