import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        String nomeArquivo = (".\\matriz.csv");
        Leitor leitor = new Leitor();
        PesosGrafos pesos = leitor.importar(nomeArquivo);
        System.out.println(pesos.imprimir());
        FloydWarshall.executar(pesos);
        System.out.println(pesos.imprimir());
        FloydWarshall.distancia(pesos);
    }
}