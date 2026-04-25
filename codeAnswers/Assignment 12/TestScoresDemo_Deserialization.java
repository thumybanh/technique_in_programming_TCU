import java.io.*;

public class TestScoresDemo_Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("TestScores.dat"));

        TestScoresModification[] all_test = (TestScoresModification[]) input.readObject();
        input.close();

        for(int i = 0; i < all_test.length; i++){
            System.out.println("test " + (i+1) + "'s average: " + all_test[i].getAverage());
        }

    }
}
