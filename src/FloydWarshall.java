import java.util.Scanner;

public class FloydWarshall {
    public static void execute(GraphWeights weights){
        int size = weights.getSize();
        int[][] matrix = weights.getWeights();

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(i==j){
                        matrix[i][j]=0;
                    }else if(matrix[i][k] + matrix[k][j] < matrix [i][j]){
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }
        
        weights.setWeights(matrix);
    }

    public static void distance(GraphWeights weights) {
        int origin, destination;
        System.out.println("Choose the origin (Letter):");
        origin = receiveLetter(weights);
        System.out.println("Choose the destination (Letter):");
        destination = receiveLetter(weights);
        System.out.println("The distance between "+(char)(origin+65)+" and "+(char)(destination+65)+" is "+weights.distance(origin, destination));
    }

    private static int receiveLetter(GraphWeights weights) {
        Scanner entry = new Scanner(System.in);
        int data;
        char in;
        do{
            in = entry.next().charAt(0);
            data = converte(in);
            if(data<0||data>weights.getSize()-1){
                System.out.println("Invalid entry. Please try only with valid Letters");
            }
        }while(data<0||data>weights.getSize()-1);
        return data;
    }

    private static int converte(char in) {
        int data = in;
        return (data > 96 ? data-97 : data-65);
    }
}
