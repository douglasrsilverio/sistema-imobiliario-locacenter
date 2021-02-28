package com.example.locacenter.model.entidades;

public class Casa {

    private String rua;
    private int numero;
    private int cep;
    private String hidrometro;
    private String matricula;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getHidrometro() {
        return hidrometro;
    }

    public void setHidrometro(String hidrometro) {
        this.hidrometro = hidrometro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
