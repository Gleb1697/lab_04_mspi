public class Dot {
    private double xCoordinate;
    private double yCoordinate;
    private double rRadius;
    private boolean gotHit;

    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void setRRadius(double rRadius) {
        this.rRadius = rRadius;
    }

    public double getRRadius() {
        return rRadius;
    }

    public void setGotHit(boolean gotHit) {
        this.gotHit = gotHit;
    }

    public String getGotHit() {
        return (gotHit ? "Попадание!" : "Промах!");
    }
}
