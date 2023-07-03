package application;

/**
 * @author Joeverton
 * 
 * Classe Ouvidoria que gerencia as manifestações.
 * Armazena as manifestações em um array e fornece métodos para adicionar e listar as manifestações.
 */
public class Ouvidoria {
    private Manifestacao[] manifestacoes;
    private int indiceAtual = 0;

    /**
     * Construtor para a classe Ouvidoria.
     *
     * @param tamanho O tamanho máximo da lista de manifestações.
     */
    public Ouvidoria(int tamanho) {
        manifestacoes = new Manifestacao[tamanho];
    }

    /**
     * Adiciona uma manifestação à lista de manifestações.
     *
     * @param manifestacao A manifestação a ser adicionada.
     */
    public void adicionarManifestacao(Manifestacao manifestacao) {
        if (indiceAtual < manifestacoes.length) {
            manifestacoes[indiceAtual++] = manifestacao;
        }
    }

    /**
     * Verifica se a lista de manifestações está cheia.
     *
     * @return Verdadeiro se a lista de manifestações estiver cheia, falso caso contrário.
     */
    public boolean isCheia() {
        return indiceAtual >= manifestacoes.length;
    }

    /**
     * Lista todas as manifestações.
     */
    public void listarManifestacoes() {
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println((i+1) + " - " + manifestacoes[i]);
        }
    }

    /**
     * Lista as manifestações de um determinado tipo.
     *
     * @param tipo O tipo das manifestações a serem listadas.
     * @return A quantidade de manifestações listadas.
     */
    public int listarManifestacoesPorTipo(int tipo) {
        int count = 0;

        for (Manifestacao manifestacao : manifestacoes) {
            if (manifestacao != null && manifestacao.getTipo() == tipo) {
                System.out.println(manifestacao);
                count++;
            }
        }

        return count;
    }
}



