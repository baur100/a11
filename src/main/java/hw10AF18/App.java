package hw10AF18;

public class App {
    public static void main(String[] args) {
        VrAccessuares accessuar1 = new VrAccessuares(VrBrand.OCULUS, "Rift C", 2017, "Link cable", "USB/USB-C");

        VrAccessuares accessuar2 = new VrAccessuares();
        accessuar2.setVrBrand(VrBrand.HTC);
        accessuar2.setModel("VivePro");
        accessuar2.setYearOfRelease(2018);
        accessuar2.setName("Base station");
        accessuar2.setConnection("Wireless");

        System.out.println("-------------------VR accessory--------------");
        System.out.println(accessuar1.infoAccessory());
        accessuar1.typeConnection();
        accessuar1.typeFunction("Improving image quality");

        System.out.println(accessuar2.infoAccessory());
        accessuar2.typeConnection();
        accessuar2.typeFunction("Motion tracking");

        VrApplications application1= new VrApplications(VrBrand.PLAYSTATION,"PlayStation VR",2017,"Batman","Arcade",40.5);

        VrApplications application2= new VrApplications();
        application2.setVrBrand(VrBrand.PIMAX);
        application2.setModel("Vision 5K");
        application2.setYearOfRelease(2019);
        application2.setName("Galaxy Battle");
        application2.setType("Casual");
        application2.setWeight(23.5);

        System.out.println("-------------------VR applications---------------");
        application1.infoApplication();
        application2.infoApplication();

        Colors[] c1={Colors.WHITE,Colors.GREY};
        FullKitVR kit1= new FullKitVR(VrBrand.OCULUS,"Quest",2020,"Oculus Quest 2",c1,2);
        Colors[] c2={Colors.BLACK,Colors.BLU_STRIPES,Colors.GREY,Colors.WHITE};
        FullKitVR kit2= new FullKitVR();
        kit2.setVrBrand(VrBrand.HP);
        kit2.setModel("Windows MR");
        kit2.setYearOfRelease(2019);
        kit2.setNameKit("Windows Mixed Reality");
        kit2.setColors(c2);
        kit2.setControllers(1);

        System.out.println("-------------------VR kits---------------");
        kit1.infoFullKit();
        kit1.amountOfControllers();
        kit2.infoFullKit();
        kit2.amountOfControllers();
    }
}
