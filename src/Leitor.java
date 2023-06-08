import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
    private final int inf = 100000;

    public PesosGrafos importar(String nomeArquivo) throws IOException{
        try {
            BufferedReader contador = new BufferedReader(new FileReader(nomeArquivo));
            int linhas = 0;
            while (contador.ready()){
                contador.readLine();
                linhas++;
            }
            contador.close();
            int[][] matriz = new int[linhas][linhas];
            int indice = 0;
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            while(leitor.ready()){
                String linha = leitor.readLine();
                String ref[] = linha.split(",");
                if(ref.length!=linhas){
                    System.out.println("Entrada não é uma matriz");
                    return null;
                }
                for (int i = 0; i < linhas; i++) {
                    if(ref[i].equals("inf")||ref[i].equals(" inf")||ref[i].equals("inf ")||ref[i].equals(" inf ")){
                        matriz[indice][i]=inf;
                    } else {
                    matriz[indice][i] = Integer.parseInt(ref[i]);
                    }
                }
                indice++;
            }
            leitor.close();
            PesosGrafos pesos = new PesosGrafos(matriz);
            return pesos;           
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
    }
}
