package TrablhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader_bufferedReader {
    public static void main(String[] args) {

        String path = "d:\\Documentos\\Estágio\\CursoJava\\Aprendendo_Java\\curso_programacao_java\\src\\TrablhandoComArquivos\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
