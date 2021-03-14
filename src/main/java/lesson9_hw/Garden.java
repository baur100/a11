package lesson9_hw;

public class Garden {
    private String treeName;
    private String fruitKind;
    private int treeAge;
    private int amountOfTree ;

    public String getTreeName(){
        return treeName;
    }
    public void setTreeName(String t){
        treeName=t;
    }
    public String getFruitKind(){
        return fruitKind;
    }
    public void setFruitKind(String f){
        fruitKind=f;
    }
    public int getTreeAge(){
        return treeAge;
    }
    public void setTreeAge(int n ){
        treeAge = n;

    }

    public int getAmountOfTree(){
        return amountOfTree;
    }
    public void setAmountOfTree(int a){
        amountOfTree=a;
    }

}
