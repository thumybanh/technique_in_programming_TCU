public class subclassPoint<T> extends Point<T>{
    private T z;

    public subclassPoint(T x, T y, T z){
        super(x,y);
        this.z = z;
    }
    public void setZ(T z){
        this.z = z;
    }
    public T getZ(){
        return z;
    }

    @Override
    public String toString() {
        return super.toString() + "," + z;
    }
}
