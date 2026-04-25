import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestScoresDemo_Serialization {
    public static void main(String[] args) throws InvalidTestScoreException, IOException {

        TestScoresModification test1 = new TestScoresModification(new double[]{46.3,75.4,34.5});
        TestScoresModification test2 = new TestScoresModification(new double[]{92.4, 88, 95.6});
        TestScoresModification test3 = new TestScoresModification(new double[]{70, 65.8, 80});
        TestScoresModification test4 = new TestScoresModification(new double[]{55.3, 60, 58});
        TestScoresModification test5 = new TestScoresModification(new double[]{100, 99, 97.9});

        TestScoresModification[] all_test = new TestScoresModification[]{test1,test2,test3,test4,test5};

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("TestScores.dat"));
        output.writeObject(all_test);
        output.close();


    }
}
