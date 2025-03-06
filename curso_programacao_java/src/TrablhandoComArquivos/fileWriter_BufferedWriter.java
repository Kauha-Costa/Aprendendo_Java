package TrablhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter_BufferedWriter {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good night!", "Good Morning!"};

        String path = "d:\\Documentos\\Estágio\\CursoJava\\Aprendendo_Java\\curso_programacao_java\\src\\TrablhandoComArquivos\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //true faz com que ele nao crie outro arquivo, apenas escreva no mesmo arquivo
            for (String line : lines)
            bw.write(line);
            bw.newLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
