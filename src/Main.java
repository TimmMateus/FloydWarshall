import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        String fileName = (".\\matrix.csv");
        Reader reader = new Reader();
        GraphWeights weights = reader.read(fileName);
        System.out.println(weights.print());
        FloydWarshall.execute(weights);
        System.out.println(weights.print());
        FloydWarshall.distance(weights);
        Support.waiting();
    }
}