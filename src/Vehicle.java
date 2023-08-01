public class Vehicle {
    private String passingNo;

    public Vehicle(String passingNo) {
        this.passingNo = passingNo;
    }

    public final String getPassingNo() {
        return passingNo;
    }

    public final boolean setPassingNo(String passingNo) {
        if(passingNo.length() < 10) {
            return false;
        }
        this.passingNo = passingNo;
        return true;
    }
}
