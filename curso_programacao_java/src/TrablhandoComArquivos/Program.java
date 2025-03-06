package TrablhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    String path = "d:\\Documentos\\Estágio\\CursoJava\\Aprendendo_Java\\curso_programacao_java\\src\\TrablhandoComArquivos";

    FileReader fr = null;
    BufferedReader br = null;

    try {
        fr = new FileReader(path);
        br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
    catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
    finally {
        try{
            if (br != null){
                br.close();
            }
            if (fr != null){
                fr.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
