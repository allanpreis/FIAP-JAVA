package br.com.fiap.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="TB_PEDIDO")
@SequenceGenerator(name="pedido", sequenceName = "SQ_TB_PEDIDO", allocationSize = 1)
//name -> nome no Java, utilizado no GeneratedValeu
//sequenceName -> nome da sequence no banco de dados
//allocationSize -> incremento

public class Pedido {

    @Id
    @Column(name = "cd_pedido")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "pedido")
    private int codigo;

    @Column(name = "ds_pedido", length = 250)
    private String descricao;

    @Temporal(TemporalType.TIMESTAMP) //Grava data e hora
    @Column(name = "dt_pedido", nullable = false, updatable = false)
    private Calendar data;

    @Column(name = "nm_cliente", nullable = false, length = 60)
    private String cliente;

    @Column(name = "vl_pedido")
    private double valor;

    @Transient //Não é mapeado na tabela no banco
    //Há quantos dias o pedido foi feito
    private int diasPedido;

    @Lob
    @Column(name = "fl_nota_fiscal")
    private byte[] notaFiscal;

    @Enumerated(EnumType.STRING) //Grava o texto da constante ao invés da posição (0, 1, 2, ...)
    @Column(name = "st_pagamento", nullable = false)
    private StatusPagamento statusPagamento;

    //Getters e Setters
    public int getDiasPedido() {
        return diasPedido;
    }

    public void setDiasPedido(int diasPedido) {
        this.diasPedido = diasPedido;
    }

    public byte[] getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(byte[] notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
