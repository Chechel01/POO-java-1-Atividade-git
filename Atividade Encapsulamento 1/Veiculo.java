public class Veiculo {
    private String placa;
    private String cor;
    private String numeroDePassagem;
    private String capacidadeDoTanque;
    private String velocidadeMaxima;
    private String consumoMedio;
    
    public Veiculo() {
    }

    public Veiculo(String placa, String cor, String numeroDePassagem, String capacidadeDoTanque,
            String velocidadeMaxima, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassagem = numeroDePassagem;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroDePassagem() {
        return numeroDePassagem;
    }

    public void setNumeroDePassagem(String numeroDePassagem) {
        this.numeroDePassagem = numeroDePassagem;
    }

    public String getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(String capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "\nVeiculo \nplaca: " + placa + ", \ncor: " + cor + ", \nnumeroDePassagem: " + numeroDePassagem
                + ", \ncapacidadeDoTanque: " + capacidadeDoTanque + ", \nvelocidadeMaxima: " + velocidadeMaxima
                + ", \nconsumoMedio: " + consumoMedio ;
    }

    

}
