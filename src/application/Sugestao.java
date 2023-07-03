package application;

/**
 * @author Joeverton
 * 
 * Classe Sugestao que estende a classe Manifestacao.
 * Cada objeto Sugestao é uma manifestação com um tipo específico (3).
 * Esta classe também personaliza a exibição do objeto em uma String.
 */
public class Sugestao extends Manifestacao {

    /**
     * Construtor para a classe Sugestao.
     *
     * @param pessoa A pessoa que fez a manifestação.
     * @param descricao A descrição da manifestação.
     */
    public Sugestao(Pessoa pessoa, String descricao) {
        super(pessoa, descricao);
    }

    /**
     * Getter para o tipo de manifestação.
     * Neste caso, é fixo e sempre retornará 3.
     *
     * @return O tipo de manifestação. Para Sugestao, sempre será 3.
     */
    public int getTipo() {
        return 3;
    }

    /**
     * Sobrescreve o método toString para fornecer uma exibição personalizada do objeto Sugestao.
     *
     * @return Uma string representando a Sugestao no formato: "Sugestão: [descrição] - Por: [pessoa]".
     */
    @Override
    public String toString() {
        return "Sugestão: " + getDescricao() + " - Por: " + getPessoa();
    }
}
