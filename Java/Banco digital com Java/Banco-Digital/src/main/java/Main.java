public class Main {
    public static void main(String[] args) {
        Cliente wallace = new Cliente("Wallace Fortunato");
        Conta cc = new ContaCorrente(wallace);
        Conta cp = new ContaPoupanca(wallace);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(500);

        cc.imprimirExtrato();
    }
}