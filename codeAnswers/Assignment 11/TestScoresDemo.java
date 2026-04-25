public class TestScoresDemo {
    public static void main(String[] args){
        double[] badScores= {104, 109, 98};
        double[] goodScores = {89.3, 100.0, 99.8};
        try {
            TestScores test1 = new TestScores(goodScores);
            System.out.printf("%.2f", test1.getAverage());
            System.out.println("");
        } catch (InvalidTestScoreException e) {
           System.out.println(e.getMessage());
        }

        try{
            TestScores test2 = new TestScores(badScores);
            System.out.println(test2.getAverage());
        } catch (InvalidTestScoreException e){
            System.out.println(e.getMessage());
        }
    }
}
