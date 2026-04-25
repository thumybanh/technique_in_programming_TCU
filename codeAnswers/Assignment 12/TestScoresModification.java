/**
 * Represents a collection of test scores and provides
 * methods to calculate statistics on those scores.
 * @author mybanh
 * @since 04-21-2026
 * @version 1.0
 */
import java.io.*;
public class TestScoresModification implements Serializable{
    private final double[] scores;

    /**
     * Constructs a TestScores object with the given array of scores.
     *
     * @param s the array of test scores to store
     * @throws InvalidTestScoreException if any score in the array
     *         is less than 0 or greater than 100, with the element
     *         index and invalid value included in the error message
     */
    public TestScoresModification(double[] s) throws InvalidTestScoreException {
        scores = s;
        for(int i = 0 ; i < s.length ; i++){
            if(s[i] < 0 || s[i] > 100){
                throw new InvalidTestScoreException(i, s[i]);
            }
        }
    }
    /**
     * Calculates and returns the average of all test scores.
     *
     * @return the average of the test scores as a double
     */
    public double getAverage(){
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }



}
