public class HondaCar extends Vehicle {
    private int color;
    private String passingNo;

    public HondaCar(String passingNo, int color) {
        super(passingNo);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    /*@Override
    public boolean setPassingNo(String passingNo) {
        this.passingNo = passingNo;
        return true;
    }

    @Override
    public String getPassingNo() {
        return passingNo;
    }*/
}
