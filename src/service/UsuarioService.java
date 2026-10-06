/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.usuariodao;
import persistencia.Usuario;

/**
 *
 * @author Desktop
 */
public class UsuarioService {
    private final usuariodao dao;

    public UsuarioService(usuariodao dao) {
        this.dao = dao;
    }

    public void cadastrarUsuario(Usuario v){
        dao.inserir(v);
    }
}
