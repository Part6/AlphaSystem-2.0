/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import persistencia.Fornecedor;
import dao.fornecedordao;

/**
 *
 * @author Desktop
 */
public class FornecedorService {
    private final fornecedordao dao;

    public FornecedorService(fornecedordao dao) {
        this.dao = dao;
    }

    public void cadastrarFornecedor(Fornecedor v){
        dao.inserir(v);
    }
}
