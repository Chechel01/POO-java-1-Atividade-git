public class MainClientes {
    public static void main(String[] args) {
        Clientes clientes1 = new Clientes("Michel", "18", "null", "Cabula/Beiru ", "71900000");
        Veiculo veiculo1 = new Veiculo("cx15s0", "preta", "5", "50.000", "500KMH", "20 L por KM");
        System.out.println(clientes1.toString());
        System.out.println(veiculo1.toString());

    }
}
