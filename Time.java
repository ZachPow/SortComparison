public class Time {
    private int size;
    private Long time;

    public Time(long time, int size) {
        this.time = time;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public long getTime() {
        return time;
    }
}
