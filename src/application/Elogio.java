package application;

/**
 * @author Joeverton Bento de Sousa
 * 
 * Classe Elogio que representa um tipo específico de Manifestacao.
 * Esta classe herda de Manifestacao.
 */
public class Elogio extends Manifestacao {
    
    /**
     * Construtor para a classe Elogio.
     * 
     * @param pessoa A pessoa que faz a manifestação.
     * @param descricao A descrição da manifestação.
     */
    public Elogio(Pessoa pessoa, String descricao) {
        super(pessoa, descricao);
    }

    /**
     * Retorna o tipo da manifestação.
     * Neste caso, o tipo é 2, que representa Elogio.
     *
     * @return O inteiro 2, que representa o tipo Elogio.
     */
    public int getTipo() {
        return 2;
    }

    /**
     * Retorna uma representação em String da manifestação.
     * 
     * @return Uma String que representa a manifestação.
     */
    @Override
    public String toString() {
        return "Elogio: " + getDescricao() + " - Por: " + getPessoa();
    }
}
