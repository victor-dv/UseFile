package apllication;

import java.io.*;

public class Exemplo4 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\TecDevNoite\\Documents\\temp\\escrita.txt";
        String[] nomes = new String[]{"Samuel","Victor", "Joao","kaike"};


        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(filePath, true))){

            for (String line: nomes){
                buffer.write(line);
                buffer.newLine() ;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        //Função para String (split)
        String test = "Samuel,92910-1929,22/09/1977,Rua Legal - 10";
        String[] dados = test.split(",");

        for (int index = 0; index < dados.length; index++){
            System.out.println(dados[index]);
        }
    }
}
