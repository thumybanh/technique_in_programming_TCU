/**
 * The Essay class represents a graded essay composed of four scoring components:
 * grammar, spelling, correct length, and content.
 *
 * Each component contributes to the total essay score, which is passed to the GradedActivity superclass
 */

public class Essay extends GradedActivity {
    /** Grammar score for the essay (maximum 30 points). */
    private double grammar;
    /** Spelling score for the essay (maximum 20 points). */
    private double spelling;
    /** Score for meeting the required essay length (maximum 20 points). */
    private double correctLength;
    /** Content quality score for the essay (maximum 30 points). */
    private double content;

    /**
     * Constructs an Essay object with scores for grammar, spelling, correct length, and content.
     *
     * The total score is calculated as the sum of all components and is set using the inherited setScore method.
     * @param gr the grammar score (30 points)
     * @param sp the spelling score (20 points)
     * @param len the correct length score (20 points)
     * @param cnt the content score (30 points)
     */
    public Essay(double gr, double sp, double len, double cnt){
        if(gr <= 30) {
            grammar = gr;
        }
        if(sp <= 20) {
            spelling = sp;
        }
        if(len <= 20) {
            correctLength = len;
        }
        if(cnt <= 30) {
            content = cnt;
        }

        double totalScore = grammar + spelling + correctLength + content;
        setScore(totalScore);

    }

    /**
     * Sets the grammar score
     * @param g the grammar score
     */
    public void setGrammar(double g){
        grammar = g;
    }

    /**
     * Sets the spelling score
     * @param s the spelling score
     */
    public void setSpelling(double s){
        spelling = s;
    }

    /**
     * Sets the correct length score
     * @param c the correct length score
     */
    public void setCorrectLength(double c){
        correctLength = c;
    }

    /**
     * Sets content score
     * @param c the content score
     */
    public void setContent(double c){
        content = c;
    }

    /**
     * Returns the grammar score
     * @return the grammar score
     */
    public double getGrammar(){
        return grammar;
    }

    /**
     * Returns the spelling score
     * @return the spelling score
     */
    public double getSpelling(){
        return spelling;
    }

    /**
     * Returns the correct length score
     * @return the correct length score
     */
    public double getCorrectLength(){
        return correctLength;
    }

    /**
     * Returns the content score
     * @return the content score
     */
    public double getContent(){
        return content;
    }

    /**
     * Calculates and returns the total essay score by summing grammar, spelling, correct length, and content scores
     * @return the total essay score
     */
    public double getScore(){
        return grammar + spelling + correctLength + content;
    }

}

