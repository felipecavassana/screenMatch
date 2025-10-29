package Study;

import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("out/arquivo.txt");
        fileWriter.write("Conteúdo a ser gravado no arquivo");
        fileWriter.close();
    }
}
