package hwField;

public class Instruments {
    public String type;
    public String material;
    public int year;
    public boolean old;

    public String info() {return "This is an instrument";}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public void getInfo(){
        System.out.println("The Type is " + type + "\nThe Material is " + material + "\nThe year is " + year + "\nThe Instrument is old " + old);
    }


}
