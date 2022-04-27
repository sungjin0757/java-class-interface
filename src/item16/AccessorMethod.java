package item16;

public class AccessorMethod {
}

// public class에서는 public 필드를 사용하는 것이 좋지 않음
class Point{

    // deprecated version
//    public double x;
//    public double y;

    // recommended version
    private double x;
    private double y;
}

class ThreeDimensionPoint{
    private int z;

    // private 중첩 클래스는 데이터 필드를 노출해도 상관 없다. 이 클래스를 포함하는 패키지 안에서만 동작 가능하다.
    private static class TwoDimensionPoint{
        public int x;
        public int y;
    }
}

