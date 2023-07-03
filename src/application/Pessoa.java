package application;

/**
 * @author Joeverton
 * 
 * Classe Pessoa que representa uma pessoa na aplicação.
 * Cada pessoa tem um nome que pode ser obtido por um método getter.
 */
public class Pessoa {
    private String nome;

    /**
     * Construtor para a classe Pessoa.
     *
     * @param nome O nome da pessoa.
     */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    /**
     * Getter para o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sobrescreve o método toString para retornar o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    @Override
    public String toString() {
        return nome;
    }
}
