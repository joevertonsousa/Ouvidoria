package application;

/**
 * @author larissa
 * 
 * Classe abstrata Manifestacao que serve como base para diferentes tipos de manifestações.
 * As classes que herdam desta classe devem implementar o método getTipo().
 */
public abstract class Manifestacao {
    private Pessoa pessoa;
    private String descricao;

    /**
     * Construtor para a classe Manifestacao.
     * 
     * @param pessoa A pessoa que faz a manifestação.
     * @param descricao A descrição da manifestação.
     */
    public Manifestacao(Pessoa pessoa, String descricao) {
        this.pessoa = pessoa;
        this.descricao = descricao;
    }

    /**
     * Retorna a pessoa que fez a manifestação.
     *
     * @return A pessoa que fez a manifestação.
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Retorna a descrição da manifestação.
     *
     * @return A descrição da manifestação.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Método abstrato que deve ser implementado pelas classes filhas.
     * Deve retornar um inteiro que representa o tipo da manifestação.
     *
     * @return O tipo da manifestação.
     */
    public abstract int getTipo();

    /**
     * Retorna uma representação em String da manifestação.
     *
     * @return Uma String que representa a manifestação.
     */
    @Override
    public String toString() {
        return "Pessoa: " + pessoa.getNome() + ", Descrição: " + descricao;
    }
}


