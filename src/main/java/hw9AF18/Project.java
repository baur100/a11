package hw9AF18;

public class Project {
    private String name;
    private int slides;
    private String theme;
    private int weight;


    public Project(){};

    public Project(String name, int slides, String theme, int weight) {
        this.name = name;
        this.slides = slides;
        this.theme = theme;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlides() {
        return slides;
    }

    public void setSlides(int slides) {
        this.slides = slides;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String infoProject() {
        return "---PROJECT----"+
                "\nProject name=" + name +
                "\nSlides=" + slides +
                "\nTheme='" + theme  +
                "\nWeight=" + weight;
    }
    public void presenter(String namePresenter){
        System.out.println(namePresenter+" will be discuss with auditory about "+this.name);
    }
}
