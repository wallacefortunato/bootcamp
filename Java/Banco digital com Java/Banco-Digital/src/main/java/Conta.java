public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 2;
    protected int agencia;
    protected int numero;
    protected double saldo = 0.0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo){
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfDaConta() {
        System.out.println(String.format("Titular: "+ this.cliente.getNome()));
        System.out.println(String.format("Agência: "+ this.getAgencia()));
        System.out.println(String.format("Número: "+ this.getNumero()));
        System.out.println("Saldo atual: "+ this.getSaldo());
    }
}
