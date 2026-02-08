public class LabActivity extends GradedActivity {
    private String observer;

    public LabActivity(String ob, double Score){
        observer = ob;
        setScore(Score);
    }
}
