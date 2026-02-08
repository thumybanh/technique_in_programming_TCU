public class FinalExam extends GradedActivity {
    private int numQuestions;
    private int numMissed;

    public FinalExam(int questions, int missed) {
        double numericScore;

        numQuestions = questions;
        numMissed = missed;

        numericScore = 100.0 - (missed * getPointsEach());

        setScore(numericScore);
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }

    public double getPointsEach() {
        return 100.0 / numQuestions;
    }
}
