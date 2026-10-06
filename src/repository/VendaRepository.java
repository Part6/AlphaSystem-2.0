/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author Desktop
 */

import java.util.List;
import persistencia.Venda;

/**
 *
 * @author Desktop
 */
public interface VendaRepository{
    
    public void inserir(Venda v);
    public int searchId(Venda v);
    public List<Object[]> getAllEProduto();
    
}