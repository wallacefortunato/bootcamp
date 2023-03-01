package contas;

import informacoes.Titular;

public class Conta {
    private Double saldo;
    private Integer agencia;
    private Integer numero;
    private Titular titular;
    private String status;

    public void deposito (Double valor){
        this.saldo += valor;
        System.out.println("Seu depósito foi efetuado com sucesso.");
        this.exibeSaldo();
    }

    public Boolean saque (Double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Seu saque foi efetuado com sucesso.");
            this.exibeSaldo();
            return Boolean.TRUE;
        } else {
            System.out.println("Saque não permitido, saldo insuficiente.");
            return Boolean.FALSE;
        }
    }

    public Boolean transferencia (Conta contaTransferencia, Double valor){
        if (this.saldo >= valor){
            this.saque(valor);
            contaTransferencia.deposito(valor);
            System.out.println("Transferência realizada com sucesso.");
            this.exibeSaldo();

            return Boolean.TRUE;
        } else {
            System.out.println("Transferência não permitida, saldo insuficiente.");

            return Boolean.FALSE;
        }
    }

    public void exibeSaldo (){
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public String getStatus() {
        return status;
    }

    public void alteraStatus () {
        if (this.status == "Ativa"){
            this.status = "Desativada";
        } else {
            this.status = "Ativa";
        }
    }
}
