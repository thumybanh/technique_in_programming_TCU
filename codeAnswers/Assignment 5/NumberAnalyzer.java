public class NumberAnalyzer<T extends Number>{
    private T[] arr;
    public NumberAnalyzer(T[] arr){
        this.arr = arr;
    }
    public T highest(){
        T highestVal = arr[0];
        for(var i : arr){
            if(i.doubleValue() > highestVal.doubleValue()){
                highestVal = i;
            }
        }
        return highestVal;
    }
    public T lowest(){
        T lowestVal = arr[0];
        for(var i : arr){
            if(i.doubleValue() < lowestVal.doubleValue()){
                lowestVal = i;
            }
        }
        return lowestVal;
    }
    public int totalElement(){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            count++;
        }
        return count;
    }
    public double average(){
        double sum = 0;
        double average = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i].doubleValue();
            average = sum/totalElement();
        }
        return average;
    }

}
