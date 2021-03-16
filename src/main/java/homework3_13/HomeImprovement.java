package homework3_13;

public class HomeImprovement {
    private String name;
    private TypeDrill type;
    private CordStyle cordStyle;

    public HomeImprovement(String name,TypeDrill type,CordStyle cordStyle){
        this.name=name;
        this.type=type;
        this.cordStyle=cordStyle;
    }

    public String toString(){
        return "Home Improvement-"+name+", Type Drill:"+type+", Cord Style:"+cordStyle;
    }
}
