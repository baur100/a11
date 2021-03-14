package hm9;

public class CellPhone {
    private String ios;
    private String android;
    private float iOsVersion;
    private float androidVersion;
    private boolean isIos;

//    public CellPhone(){}

    public CellPhone(String ios, String android, float iosVersion, float androidVersion, boolean isIos){
        this.android = android;
        this.ios = ios;
        this.iOsVersion = iosVersion;
        this.androidVersion = androidVersion;
        this.isIos = isIos;

    }

    public CellPhone(String ios, float iOsVersion, boolean isIos){
        this.ios = ios;
        this.iOsVersion = iOsVersion;
        this.isIos = isIos;
    }

    public void cellPhone(String ios, String android){
        this.ios = ios;
        this.android = android;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

    public String getAndroid() {
        return android;
    }

    public void setAndroid(String android) {
        this.android = android;
    }

    public float getiOsVersion() {
        return iOsVersion;
    }

    public void setiOsVersion(float iOsVersion) {
        this.iOsVersion = iOsVersion;
    }

    public float getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(float androidVersion) {
        this.androidVersion = androidVersion;
    }

    public boolean isIos() {
        return isIos;
    }

    public void setIos(boolean ios) {
        isIos = ios;
    }

    public String printInfo(boolean isIos){
        if (isIos) {
            return "Cell phone under:" + ios + "\nIOS version: " + iOsVersion;
        }
        return "You don't have an apple";

    }
    public String printClass(boolean isIos){
        if (isIos) {
            return "I have an Apple";
        } return "I have an Android";
    }
}
