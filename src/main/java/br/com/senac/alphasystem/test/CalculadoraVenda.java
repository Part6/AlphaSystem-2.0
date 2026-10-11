/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.alphasystem.test;

/**
 *
 * @author Desktop
 */
public class CalculadoraVenda {

    public double calcularTotal(double preco, int quantidade) {

        if (preco < 0) {
            throw new IllegalArgumentException(
                    "O preço não pode ser negativo."
            );
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade deve ser maior que zero."
            );
        }

        return preco * quantidade;
    }
    
    public double calcularEstoque(double itensVenda, int itensProduto) {
        
        double novoEstoque = itensProduto - itensVenda;
        
        if (itensProduto < 0) {
            throw new IllegalArgumentException(
                    "Estoque não pode ser menor que zero."
            );
        }

        if (itensVenda < 0) {
            throw new IllegalArgumentException(
                    "Não há como vender " + itensVenda + " itens"
            );
        }
        
        if(novoEstoque < 0){
            throw new IllegalArgumentException(
                    "Novo Estoque não pode ser menor que zero."
            );
        }

        return novoEstoque;
    }
}
