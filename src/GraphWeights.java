public class GraphWeights {
    private int[][] matrix;
    private int size;

    public GraphWeights (int[][] matrix){
        this.matrix = matrix;
        this.size = matrix.length;
    }

    public void setWeights(int[][] matrix){
        this.matrix = matrix;
    }

    public int[][] getWeights(){
        return matrix;
    }

    public int getSize(){
        return size;
    }

    public int distance(int origin, int destination){
        return matrix[origin][destination];
    }

    public String print(){
        String print = new String();
        print = "  ";
        for (int i = 0; i < matrix.length; i++){
            print = print + (char) (65+i) + "  ";
        }
        print = print + "\n";
        for (int i = 0; i < matrix.length; i++) {
            print = print + (char) (65+i) + " ";
            for (int j = 0; j < matrix.length; j++) {
                print = print+matrix[i][j]+", ";
            }
            print = print + "\n";
        }
        return print;
    }
}
