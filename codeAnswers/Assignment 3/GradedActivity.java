public class GradedActivity {
    private double score;

    public GradedActivity(){
        score = 0.0;
    }

    public void setScore(double s){
        score = s;
    }

    public double getScore(){
        return score;
    }

    public char getGrade(){
        char letterGrade;

        if(score >= 90.0){
            letterGrade = 'A';
        } else if (score >= 80.0) {
            letterGrade = 'B';
        } else if (score >= 70.0) {
            letterGrade = 'C';
        } else if (score >= 60.0) {
            letterGrade = 'D';
        } else letterGrade = 'F';

        return letterGrade;
    }
}
