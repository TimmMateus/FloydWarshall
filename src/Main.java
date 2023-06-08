import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        String nomeArquivo = (".\\matriz.csv");
        Leitor leitor = new Leitor();
        PesosGrafos pesos = leitor.importar(nomeArquivo);
        System.out.println(pesos.imprimir());
        FloydWarshall.executar(pesos);
        System.out.println(pesos.imprimir());
        Scanner entrada = new Scanner(System.in);
        int origem, destino;
        char in = ' ';
        do{
            System.out.print("Selecione a letra origem: ");
            in = entrada.next().charAt(0);
            origem= in-65;
        }while(origem<0||origem>pesos.getTamnho()-1);
        do{
            System.out.print("Selecione a letra destino: ");            
            in = entrada.next().charAt(0);
            destino = in-65;
        }while(destino<0||destino>pesos.getTamnho()-1);
        entrada.close();
        System.out.println("A distancia entre "+(char)(origem+65)+" e "+(char)(destino+65)+" é de "+pesos.distancia(origem, destino));
    }
}