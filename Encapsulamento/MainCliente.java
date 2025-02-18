public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Marta");
        cliente1.setEmail("marta@gmail.com");
        cliente1.setSenha("123");

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Senha: " + cliente1.getSenha());

        Cliente cliente2 = new Cliente("jose", "jose@gmail.com ", "321");
        System.out.println(cliente2.toString());

        Cliente cliente3 = new Cliente("jose", "jose@gmail.com ", "321");
        System.out.println(cliente3.toString());

    }

}
