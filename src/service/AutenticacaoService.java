/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.Criptografia;
import dao.usuariodao;
import persistencia.Usuario;

/**
 *
 * @author Desktop
 */
public class AutenticacaoService {
    
    private final usuariodao dao;
    
    public AutenticacaoService(usuariodao dao) {
        this.dao = dao;
    }

    public Usuario validarUsuario(String login, String senha){
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(Criptografia.getMD5(senha));
        return dao.validarUsuarioSeguro(usuario);
    }
}
