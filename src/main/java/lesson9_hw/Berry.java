package lesson9_hw;

public class Berry {
    private String name;
    private String color;
    private String taste;
    private int weighInBasket;
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setTaste(String taste){
        this.taste=taste;
    }
    public String getTaste(){
        return this.taste;
    }
    public void setWeighInBasket(int weighInBasket){
        this.weighInBasket=weighInBasket;
    }
    public int getWeighInBasket(){
        return this.weighInBasket;
    }
}