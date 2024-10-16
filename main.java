package TabelaHash;

public class main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(); 

        int[] numeros = {12, 25, 37, 41, 53, 64, 78, 89};

        for (int numero : numeros) {
            tabelaHash.inserir(numero);
        }

        System.out.println("Tabela hash após a inserção:");
        tabelaHash.exibirTabelaHash(); 

        System.out.println("\nVerificando números:");
        System.out.println("Número 25 encontrado? " + tabelaHash.existe(25)); 
        System.out.println("Número 50 encontrado? " + tabelaHash.existe(50)); 
        System.out.println("\nRemovendo o número 25:");
        tabelaHash.remover(25); 

        System.out.println("Tabela hash após a remoção:");
        tabelaHash.exibirTabelaHash(); 
    }
}
