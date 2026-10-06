/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author Desktop
 */

import persistencia.Usuario;

/**
 *
 * @author Desktop
 */
public interface UsuarioRepository{
    
    public void inserir(Usuario p);
    public Usuario validarUsuarioSeguro(Usuario Usuario);
}
