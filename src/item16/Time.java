package item16;

public final class Time {
    private static final int HOURS_PER_DAY=  24;
    private static final int MINUTES_PER_DAY=60;

    // 불변식은 보장하지만, 내부 표현 방식을 언제든 바꿀수 있는 유연성이 없다.
    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
}
