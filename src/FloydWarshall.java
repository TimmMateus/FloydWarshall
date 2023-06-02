public class FloydWarshall {
    public static void executar(PesosGrafos pesos){
        int tamanho = pesos.getTamnho();
        int[][] matriz = pesos.getPesos();

        for (int k = 0; k < tamanho; k++) {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    if(i==j){
                        matriz[i][j]=0;
                    }else if(matriz[i][k] + matriz[k][j] < matriz [i][j]){
                        matriz[i][j] = matriz[i][k] + matriz[k][j];
                    }
                }
            }
        }
        
        pesos.setPesos(matriz);
    }
}
