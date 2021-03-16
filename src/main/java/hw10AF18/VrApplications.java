package hw10AF18;

public class VrApplications extends HeadsetVR{
    private String name;
    private String type;
    private double weight;

    public VrApplications(){
        super();
    };

    public VrApplications(VrBrand vrBrand, String model, int yearOfRelease, String name,String type, double weight) {
        super(vrBrand, model, yearOfRelease);
        this.name=name;
        this.type=type;
        this.weight=weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void infoApplication() {
        System.out.println(
                "The headset " + vrBrand +
                " " + model+ " " + yearOfRelease +"\nYou can play in VR applications: " + name
                + "\nType: " + type  +
                "\nWeight: " + weight);
    }
}
