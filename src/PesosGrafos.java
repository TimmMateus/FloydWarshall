public class PesosGrafos {
    private int[][] matriz;
    private int tamanho;

    public PesosGrafos (int[][] matriz){
        this.matriz = matriz;
        this.tamanho = matriz.length;
    }

    public void setPesos(int[][] matriz){
        this.matriz = matriz;
    }

    public int[][] getPesos(){
        return matriz;
    }

    public int getTamnho(){
        return tamanho;
    }

    public int distancia(int origem, int destino){
        return matriz[origem][destino];
    }

    public String imprimir(){
        String imprimir = new String();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                imprimir = imprimir+matriz[i][j]+", ";
            }
            imprimir = imprimir + "\n";
        }
        return imprimir;
    }
}
