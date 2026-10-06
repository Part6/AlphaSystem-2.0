/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.util.List;
import persistencia.Cliente;
/**
 *
 * @author Desktop
 */
public interface ClienteRepository{
    
    public void inserir(Cliente cliente);
    
    public Cliente search(String nome);
    
    public List<Object[]> getAllEEndereco();
    
    
}
