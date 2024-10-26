public class CriarPessoas {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setEndereco("Rua 1");
        pessoa.setTelefone("12 99989-8989");

        pessoa.imprimir();
    }

}
