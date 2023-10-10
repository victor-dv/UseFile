package apllication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        /*Vamos trabalhar com arquivos e pasta*/

        Scanner scanner = null; // Significa que vou criar ele em um espaço vazio

        File file = new File("C:\\Users\\TecDevNoite\\Documents\\temp\\exemplo1.txt");

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Eu passei por aqui");
            if (scanner != null ){
                scanner.close();
                System.out.println("Fechei...");
            }
        }
    }
}
