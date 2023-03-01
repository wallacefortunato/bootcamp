package informacoes;

import contas.Conta;
import informacoes.utilitarios.Endereco;

public class Titular {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Integer telefone;
    private String profissao;
    private Conta[] contas;

    public Boolean alterarProfissao(String novaprofissao){
        this.profissao = novaprofissao;
        System.out.println("Profissão alterada com sucesso.");
        return Boolean.TRUE;
    }


}
