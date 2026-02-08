public class CourseGrades implements Analyzable{
    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;
    // constructor with no args
    public CourseGrades(){
        grades = new GradedActivity[NUM_GRADES];
    }
    // set each objects into the array
    public void setLab(GradedActivity aLab){
        grades[0] = aLab;
    }
    public void setPassFailExam(PassFailExam aPassFailExam){
        grades[1] = aPassFailExam;
    }
    public void setEssay(Essay anEssay){
        grades[2] = anEssay;
    }
    public void setFinalExam(FinalExam aFinalExam){
        grades[3] = aFinalExam;
    }
    // to get the average score
    public double getAverage(){
        return (grades[0].getScore() + grades[1].getScore() + grades[2].getScore() + grades[3].getScore())/NUM_GRADES;
    }
    // to get the highest score out of all
    public GradedActivity getHighest(){
        GradedActivity highestScore = grades[0];
        for(int i = 0; i < grades.length; i++ ){
            if (grades[i].getScore() > highestScore.getScore()){
                highestScore = grades[i];
            }
        }
        return highestScore;
    }
    // to get the lowest out of all
    public GradedActivity getLowest(){
        GradedActivity LowestScore = grades[0];
        for(int i = 0; i < grades.length; i++ ){
            if (grades[i].getScore() < LowestScore.getScore()){
                LowestScore = grades[i];
            }
        }
        return LowestScore;
    }


    public String toString(){
        return "Lab score: " + grades[0].getScore() + "     " + "Lab Grade: " + grades[0].getGrade() +
                "\nPass Fail exam score: " + grades[1].getScore() + "    " + "Pass Fail exam grade: " + grades[1].getGrade() +
                "\nEssay Score: " + grades[2].getScore() + "    " + "Essay Grade: " + grades[2].getGrade() +
                "\nFinal Exam Score: " + grades[3].getScore() + "  " + "Final Exam Grade: " + grades[3].getGrade() +
                "\nAverage score: " + getAverage() +
                "\nHighest score: " + getHighest().getScore() +
                "\nLowest score: " + getLowest().getScore();
    }


}
