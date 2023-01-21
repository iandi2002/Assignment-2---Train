public class Locomotive {
    private String id;
    private String speed;
    private String emptyCapacity;
    private String timeInWay;
    private String direction;

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return this.speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getEmptyCapacity() {
        return this.emptyCapacity;
    }

    public void setEmptyCapacity(String emptyCapacity) {
        this.emptyCapacity = emptyCapacity;
    }

    public String getTimeInWay() {
        return this.timeInWay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setTimeInWay(String timeInWay) {
        this.timeInWay = timeInWay;
    }

    public Locomotive() {
    }

    Locomotive(String speed, String emptyCapacity, String id, String direction, String timeInWay) {
        this.timeInWay = timeInWay;
        this.speed = speed;
        this.emptyCapacity = emptyCapacity;
        this.direction = direction;
        this.id = id;
    }
}

