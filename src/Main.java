import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        PesosGrafos pesos = new PesosGrafos(MatrizEntrada.matriz);
        System.out.println(pesos.imprimir());
        FloydWarshall.executar(pesos);
        System.out.println(pesos.imprimir());
        Scanner entrada = new Scanner(System.in);
        int origem, destino;
        //do{
            System.out.print("Selecione a origem: ");
            origem = entrada.nextInt();
        //}while(origem>=0||origem<=pesos.getTamnho());
        //do{
            System.out.print("Selecione o destino: ");
            destino = entrada.nextInt();
        //}while(destino>=0||destino<=pesos.getTamnho());
        entrada.close();
        System.out.println(pesos.distancia(origem, destino));
    }
}