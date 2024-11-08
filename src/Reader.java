import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private final int inf = 100000;

    public GraphWeights read(String fileName) throws IOException{
        try {
            BufferedReader pointer = new BufferedReader(new FileReader(fileName));
            int lines = 0;
            while (pointer.ready()){
                pointer.readLine();
                lines++;
            }
            pointer.close();
            int[][] matrix = new int[lines][lines];
            int index = 0;
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while(reader.ready()){
                String line = reader.readLine();
                String ref[] = line.split(",");
                if(ref.length!=lines){
                    System.out.println("Entry isn't a matrix");
                    return null;
                }
                for (int i = 0; i < lines; i++) {
                    if(ref[i].equals("inf")||ref[i].equals(" inf")||ref[i].equals("inf ")||ref[i].equals(" inf ")){
                        matrix[index][i]=inf;
                    } else {
                    matrix[index][i] = Integer.parseInt(ref[i]);
                    }
                }
                index++;
            }
            reader.close();
            GraphWeights weights = new GraphWeights(matrix);
            return weights;           
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
    }
}
