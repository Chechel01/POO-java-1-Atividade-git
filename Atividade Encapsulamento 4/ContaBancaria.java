public class ContaBancaria {
    private String banco;
    private int agencia;
    private int numeroDaConta;
    private String tipoDaConta;
    private int saldoAtual;
    private int limiteDisponivel;
    
    public ContaBancaria() {
    }

    public ContaBancaria(String banco, int agencia, int numeroDaConta, String tipoDaConta, int saldoAtual,
            int limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDaConta = tipoDaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public int getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(int limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "\n\nConta Bancária \nBanco: " + banco + ", \nAngençia: " + agencia + ", \nNumero Da conta: " + numeroDaConta
                + ", \nTipo da conta: " + tipoDaConta + ", \nSaldo atual: " + saldoAtual + ", \nLimite Disponivel: "
                + limiteDisponivel ;
    }

    

}
