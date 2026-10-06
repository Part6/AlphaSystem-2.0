/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ProdutoHasVendaDao;
import dao.produtodao;
import java.util.List;
import persistencia.Venda;
import repository.VendaRepository;

/**
 *
 * @author Desktop
 */
public class VendaService {
    private final VendaRepository vendaRepository;
    private final produtodao produtodao;
    private final ProdutoHasVendaDao phv;
    
    public VendaService(VendaRepository vendaRepository,
            produtodao produtodao,
            ProdutoHasVendaDao phv) {
        this.vendaRepository = vendaRepository;
        this.produtodao = produtodao;
        this.phv = phv;
    }

    public void cadastrarVenda(Venda v, String nomeProduto){
        vendaRepository.inserir(v);
        this.AtribuirProdutoAVenda(v, nomeProduto);
    }
    
    private void AtribuirProdutoAVenda(Venda v, String nomeProduto){
        
        phv.inserir(vendaRepository.searchId(v), produtodao.searchId(nomeProduto)); 
    }
    
    public List<Object[]> DadosDoProduto(){
        return vendaRepository.getAllEProduto();
    }
}
