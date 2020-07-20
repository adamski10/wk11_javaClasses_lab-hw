public class WaterBottle {
    private int volume = 100;


    public int getVolume() {
        return volume;
    }

    public int drink() {
        return this.volume - 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public int fill() {
        return this.volume = 100;
    }
}
