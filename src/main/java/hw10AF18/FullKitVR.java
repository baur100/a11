package hw10AF18;

public class FullKitVR extends HeadsetVR implements Controllers {
    private String nameKit;
    private Colors[] colors;
    private int controllers;

    public FullKitVR() {
    }

    public FullKitVR(VrBrand vrBrand, String model, int yearOfRelease, String nameKit, Colors[] colors, int controllers) {
        super(vrBrand, model, yearOfRelease);
        this.nameKit = nameKit;
        this.colors = colors;
        this.controllers = controllers;
    }

    public String getNameKit() {
        return nameKit;
    }

    public void setNameKit(String nameKit) {
        this.nameKit = nameKit;
    }

    public Colors[] getColors() {
        return colors;
    }

    public void setColors(Colors[] colors) {
        this.colors = colors;
    }

    public int getControllers() {
        return controllers;
    }

    public void setControllers(int controllers) {
        this.controllers = controllers;
    }

    @Override
    public void amountOfControllers() {
        System.out.println("The " + vrBrand + " " +model +" " + yearOfRelease + " has " + controllers + " controllers");
    }


    public String infoFullKit() {
        return "Full kit VR " + nameKit +
                "\nOptions of  colors: " + colors +
                "The kit include: " + "\nControllers: " + controllers +
                "\nVR Headset: " + vrBrand + model + yearOfRelease;
    }
}


