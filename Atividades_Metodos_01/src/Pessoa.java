/* Escreva uma classe em Java que apresenta entidade Pessoa,tendo
como atributos nome, endereço e telefone e, o método imprimir.O método
imprimir deve mostrar na tela os valores de todos os atributos.Não se
esqueça de criar um construtor para inicializar os dados.
 */

public class Pessoa {
    private String nome, endereco, telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimir() {
        System.out.println("\t----Pessoa----\t");
        System.out.println("\tNome: " + nome);
        System.out.println("\tEndereco: " + endereco);
        System.out.println("\tTelefone: " + telefone);
    }

}
