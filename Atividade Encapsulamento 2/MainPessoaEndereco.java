public class MainPessoaEndereco {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Michel", "21", new Endereco("tv pedr", "21", "salvador"));
        System.out.println(pessoa1.toString());
    }

}
