import java.util.Scanner;

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

    public static void distancia(PesosGrafos pesos) {
        int origem, destino;
        System.out.println("Selecione a letra origem:");
        origem = receberLetra(pesos);
        System.out.println("Selecione a letra destino:");
        destino = receberLetra(pesos);
        System.out.println("A distancia entre "+(char)(origem+65)+" e "+(char)(destino+65)+" é de "+pesos.distancia(origem, destino));
    }

    private static int receberLetra(PesosGrafos pesos) {
        Scanner entrada = new Scanner(System.in);
        int dado;
        char in;
        do{
            in = entrada.next().charAt(0);
            dado = converte(in);
            if(dado<0||dado>pesos.getTamnho()-1){
                System.out.println("Dado inválido, insira apenas letras correspondentes.");
            }
        }while(dado<0||dado>pesos.getTamnho()-1);
        return dado;
    }

    private static int converte(char in) {
        int dado = in;
        return (dado > 96 ? dado-97 : dado-65);
    }
}
