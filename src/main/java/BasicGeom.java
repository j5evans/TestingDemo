import java.awt.*;

public class BasicGeom {

    public static double calcDistance(Point p1, Point p2) {
        double distance = 0;
        var xChange = (p1.x - p2.x);
        var yChange = (p1.y - p2.y);
        var intermediate = (xChange * xChange) + (yChange * yChange);
        distance = Math.sqrt(intermediate);
        return distance;
    }
}
