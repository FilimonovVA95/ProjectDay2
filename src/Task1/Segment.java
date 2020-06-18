package Task1;

public class Segment {
    private double coordinateX1;
    private double coordinateY1;
    private double coordinateX2;
    private double coordinateY2;
    private double epsilon = 0.0001;

    public Segment(double coordinateX1, double coordinateY1, double coordinateX2, double coordinateY2) {
        if (coordinateX1 == coordinateX2 && coordinateY1 == coordinateY2)
            throw new RuntimeException("this is not a segment, this is the point");

        this.coordinateX1 = coordinateX1;
        this.coordinateY1 = coordinateY1;
        this.coordinateX2 = coordinateX2;
        this.coordinateY2 = coordinateY2;
    }

    public boolean isEqual (Segment segment) {
        return Math.abs(this.segmentLength() - segment.segmentLength()) < epsilon;
    }

    private double segmentLength() {
        double lengthX = Math.abs(coordinateX1 - coordinateX2);
        double lengthY = Math.abs(coordinateY1 - coordinateY2);

        return Math.cbrt(lengthX*lengthX + lengthY*lengthY);
    }
}
