import java.util.ArrayList;

public class HighestLowestElements<T extends Comparable<T>>{
    private T[] objs;
    public HighestLowestElements(T[] objs){
        this.objs = objs;
    }

    public T highest(){
        T highest = objs[0];
        for(var i : objs){
            if(i.compareTo(highest) > 0){
                highest = i;
            }
        }
        return highest;
    }

    public T lowest(){
        T lowest = objs[0];
        for(var i : objs){
            if(i.compareTo(lowest) < 0){
                lowest = i;
            }
        }
        return lowest;
    }

}
