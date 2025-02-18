public class MainFuncionarioContaBancaria {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Michel", "tv. pedro fe", 7190000, "mychellb@", new ContaBancaria("c6bank", 512, 458, "poupança", 20000, 15000));
        System.out.println(funcionario.toString());
    }

}
