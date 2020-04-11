import java.util.ArrayList;
public class Canvas {
    points ArrayList<Point> = new ArrayList<Point>();

    public ArrayList<Point> AddPoint(double x, double y, ArrayList<Point> points){
       return points.add(new Point(x, y));
    }
}
