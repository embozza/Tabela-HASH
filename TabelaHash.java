package TabelaHash;

public class TabelaHash {
    private int[] tabelaHash;

    public TabelaHash() {
        tabelaHash = new int[10]; 
    }

    private int calcularHash(int numero) {
        return numero % 10; 
    }

    public void inserir(int numero) {
        int indice = calcularHash(numero);
        if (tabelaHash[indice] == 0) {
            tabelaHash[indice] = numero;
        } else {
            System.out.println("Colisão ao inserir " + numero + " na posição " + indice);
        }
    }

    public boolean existe(int numero) {
        int indice = calcularHash(numero);
        return tabelaHash[indice] == numero; 
    }

    public int remover(int numero) {
        int indice = calcularHash(numero);
        if (tabelaHash[indice] == numero) {
            int valorRemovido = tabelaHash[indice];
            tabelaHash[indice] = 0; 
            return valorRemovido;
        } else {
            System.out.println("Chave " + numero + " não encontrada para remoção.");
            return 0; 
        }
    }

    public void exibirTabelaHash() {
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println("Posição " + i + ": " + tabelaHash[i]);
        }
    }
}
