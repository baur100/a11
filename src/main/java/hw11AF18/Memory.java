package hw11AF18;

public class Memory {
    private String typeOfSlots;
    private int amount;

    public Memory(){};
    public Memory(String typeOfSlots, int amount) {
        this.typeOfSlots = typeOfSlots;
        this.amount = amount;
    }

    public String getTypeOfSlots() {
        return typeOfSlots;
    }

    public void setTypeOfSlots(String typeOfSlots) {
        this.typeOfSlots = typeOfSlots;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Memory" +
                "\nType of slots= " + typeOfSlots +
                "\nAmount= " + amount;
    }
}
