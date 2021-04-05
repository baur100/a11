package simpleExamplePassingParametersToObjectsAndMethods040321;

public class boatClass040321 {
private String boatMaker;
private String boatType;
private Integer boatLength;
String boatMovingStatus;

    public boatClass040321(String boatMaker, String boatType, Integer boatLength) {
        this.boatMaker = boatMaker;
        this.boatType = boatType;
        this.boatLength = boatLength;
    }

    public String boatUnderWay (boolean boatGoingStatus) {
        if (boatGoingStatus = true) {
            boatMovingStatus = "We're Moving";
        }
         else boatMovingStatus = "We're Stopped";

        return boatMovingStatus;
    }

    public String getBoatMaker() {
        return boatMaker;
    }

    public void setBoatMaker(String boatMaker) {
        this.boatMaker = boatMaker;
    }

    public String getBoatType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public Integer getBoatLength() {
        return boatLength;
    }

    public void setBoatLength(Integer boatLength) {
        this.boatLength = boatLength;
    }

    public String getBoatMovingStatus() {
        return boatMovingStatus;
    }

    public void setBoatMovingStatus(String boatMovingStatus) {
        this.boatMovingStatus = boatMovingStatus;
    }

    @Override
    public String toString() {
        return "boatClass040321{" +
                "boatMaker='" + boatMaker + '\'' +
                ", boatType='" + boatType + '\'' +
                ", boatLength=" + boatLength +
                ", boatMovingStatus='" + boatMovingStatus + '\'' +
                '}';
    }
} //end of boat class
