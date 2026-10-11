/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.alphasystem.test;

/**
 *
 * @author Desktop
 */
import java.time.LocalDate;

public class Venda {
    private int idVenda;
    private String cliente;
    private String observacoes;
    private LocalDate data;
    private int quantidadeItens;


    public int getIdVenda() { return idVenda; }
    public void setIdVenda(int idVenda) { this.idVenda = idVenda; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    
    public int getQuantidadeItens() { return  quantidadeItens; }
    public void setQuantidadeItens(int quantidadeItens) { this.quantidadeItens =  quantidadeItens; }

}
