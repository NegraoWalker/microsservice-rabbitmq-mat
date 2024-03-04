package com.walker.microsservicerabbitmqmat.dto;


public class PropostaRequestDto {

    private String nome; //Nome do Usuario
    private String sobrenome; //Sobrenome do Usuario
    private String telefone; //Telefone do Usuario
    private String cpf; //cpf do Usuario
    private Double renda; //Renda do Usuario
    private Double valorSolicitado; //Valor Solicitado da Proposta
    private int prazoPagamento; //Prazo de pagamento da Proposta

    public PropostaRequestDto() {
    }

    public PropostaRequestDto(String nome, String sobrenome, String telefone, String cpf, Double renda, Double valorSolicitado, int prazoPagamento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.renda = renda;
        this.valorSolicitado = valorSolicitado;
        this.prazoPagamento = prazoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public Double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(Double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public int getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(int prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }
}