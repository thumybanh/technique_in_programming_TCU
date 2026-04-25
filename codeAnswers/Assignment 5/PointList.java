import java.util.ArrayList;

public class PointList<T extends Point<?>> {
    ArrayList<T> points = new ArrayList<>();

    public PointList(){}

    public PointList(T pair){
       points.add(pair);
    }

    public void add(T point){
        points.add(point);
    }

    public ArrayList<T> getList(){
        return points;
    }

    @Override
    public String toString(){
        return "" + points;
    }
}
