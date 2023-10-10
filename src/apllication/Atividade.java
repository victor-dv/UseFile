package apllication;

public class Atividade {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\TecDevNoite\\Documents\\temp\\summary.csv";

        csvArquivo csv = new csvArquivo();
        //"Tv LED, 1290.99 , 1;VideoGame Chair, 350.50,3;IphoneX, 900.00, 2;SamsungGalaxy 850.00,2"
        csv.setNome("Tv LED, 1290.99");
        csv.setPreco(1290.00);
        csv.setQuantidade(1);
        String test = csv.getNome() + ";" + csv.getQuantidade() ;
        String[] dados = test.split(";");

        for (int index = 0; index < dados.length; index++){
            System.out.println(dados[index]);
        }
    }
}
