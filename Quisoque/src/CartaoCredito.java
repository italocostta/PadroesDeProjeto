class CartaoCredito {
    private double saldo;
    private String numero;

    public CartaoCredito(double saldo) {
        this.saldo = saldo;
    }

    public boolean validarSaldo(double valor) {
        return saldo >= valor;
    } 

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}