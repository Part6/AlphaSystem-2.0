/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.FornecedorProdutoDao;
import dao.ProdutoHasVendaDao;
import dao.fornecedordao;
import java.util.ArrayList;
import persistencia.Produto;
import persistencia.Venda;
import repository.ProdutoRepository;


/**
 *
 * @author Desktop
 */
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    private final fornecedordao fornecedordao;
    private final FornecedorProdutoDao fornecedorprodutodao;
    

    public ProdutoService(ProdutoRepository produtoRepository,
    fornecedordao fornecedordao,
    FornecedorProdutoDao fornecedorprodutodao) {
        this.produtoRepository = produtoRepository;
        this.fornecedordao = fornecedordao;
        this.fornecedorprodutodao = fornecedorprodutodao;
    }

    public void cadastrarProduto(Produto v, int idFornecedor, float taxa){
        produtoRepository.inserir(v);
        this.AtribuirProdutoAFornecedor(idFornecedor,v.getId(),taxa);
    }
    
    private void AtribuirProdutoAFornecedor(int idFornecedor, int idProduto, float taxa){
        fornecedorprodutodao.inserir(idFornecedor, idProduto, taxa);
    }
    
    public void atualizarQuantidade(String nomeProduto){
        
        int id = produtoRepository.searchId(nomeProduto);
        produtoRepository.updateQuantidade(id);
        
    }
    
    public ArrayList<Object[]> DadosDoProduto(){
        return produtoRepository.getAllEFornecedor();
    }
    
    
}
