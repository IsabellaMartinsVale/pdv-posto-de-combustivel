package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.*;
import jakarta.websocket.OnMessage;
import java.util.Date;

import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (length = 200, nullable = false)
    private  String nomeCompleto;

    @Column (length = 14, nullable = false)
    private String cpfCnpj;

    @Column (length = 12)
    private Integer numeroCtps;

    @Column (length = 10, nullable = false)
    private Date dataNascimento;


    //construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, int numeroCtps){
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
    }

    public Pessoa (){

    }

    //getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public int getNumeroCtps() {
        return numeroCtps;
    }

    //setters
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroCtps(Integer numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

}
