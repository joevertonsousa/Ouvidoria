package application;

/**
 * @author Joeverton
 * 
 * Classe Reclamacao que estende a classe Manifestacao.
 * Cada objeto Reclamacao é uma manifestação com um tipo específico (1).
 * Esta classe também personaliza a exibição do objeto em uma String.
 */
public class Reclamacao extends Manifestacao {

    /**
     * Construtor para a classe Reclamacao.
     *
     * @param pessoa A pessoa que fez a manifestação.
     * @param descricao A descrição da manifestação.
     */
    public Reclamacao(Pessoa pessoa, String descricao) {
        super(pessoa, descricao);
    }

    /**
     * Getter para o tipo de manifestação.
     * Neste caso, é fixo e sempre retornará 1.
     *
     * @return O tipo de manifestação. Para Reclamacao, sempre será 1.
     */
    public int getTipo() {
        return 1;
    }

    /**
     * Sobrescreve o método toString para fornecer uma exibição personalizada do objeto Reclamacao.
     *
     * @return Uma string representando a Reclamacao no formato: "Reclamação: [descrição] - Por: [pessoa]".
     */
    @Override
    public String toString() {
        return "Reclamacao: " + getDescricao() + " - Por: " + getPessoa();
    }
}
