/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import persistencia.Produto;

/**
 *
 * @author Desktop
 */
public interface ProdutoRepository{
    
    public int inserir(Produto p);
    public void updateQuantidade(int id);
    public List<Produto> getAll();
    public ArrayList<Object[]> getAllEFornecedor();
    public int searchId(String nome, String cate, String obs, int qnt, Double preco);
    public int searchId(String nome) ;
}
