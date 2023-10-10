package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Exemplo2 {
    public static void main(String[] args) {
        //Abertura de arquivo para leitura utilizando o bufferedRead e fileReader

        String filePath = "C:\\Users\\TecDevNoite\\Documents\\temp\\exemplo1.txt";
        BufferedReader buffer = null;
        FileReader file = null;

        try {
            file = new FileReader(filePath);
            buffer = new BufferedReader(file);

            String line = buffer.readLine();

            while (line!= null){
                System.out.println(line);
                line = buffer.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (file != null){
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
