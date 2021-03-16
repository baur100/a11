package hw10AF18;

public class VrAccessuares extends HeadsetVR implements Connection{
    private String name;
    private String connection;

    public VrAccessuares(){};

    public VrAccessuares(VrBrand vrBrand, String model, int yearOfRelease, String name, String connection) {
        super(vrBrand, model, yearOfRelease);
        this.name = name;
        this.connection = connection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }


    public String infoAccessory() {
        return "Vr accessory for " + vrBrand +" " + model +" " + yearOfRelease +
                "\nItem: " + name;
    }

    @Override
    public void typeConnection() {
        System.out.println("The "+name+ " can connect to VR headset by "+connection);

    }

    @Override
    public void typeFunction(String function) {
        System.out.println("The "+name+ "- major function is:  "+function);

    }
}
