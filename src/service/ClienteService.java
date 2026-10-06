/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.clientedao;
import dao.enderecodao;
import java.util.List;
import persistencia.Cliente;
import persistencia.Endereco;
import repository.ClienteRepository;


public class ClienteService {
    private final ClienteRepository clienteRepository;
    private final enderecodao enderecoDAO;

    public ClienteService(
            ClienteRepository clienteRepository,
            enderecodao enderecoDAO) {

        this.clienteRepository = clienteRepository;
        this.enderecoDAO = enderecoDAO;
    }

    public void cadastrarCliente(
            Cliente cliente,
            Endereco endereco) {

        enderecoDAO.inserir(endereco);

        int enderecoId = enderecoDAO.searchId(
                endereco.getRua(),
                endereco.getCidade(),
                endereco.getEstado(),
                endereco.getNumero(),
                endereco.getCep()
        );

        cliente.setEnderecoId(enderecoId);

        clienteRepository.inserir(cliente);
    }
    
    //List<Object[]> lista = new clientedao().getAllEEndereco();
    public List<Object[]> DadosDoCliente(){
        return clienteRepository.getAllEEndereco();
    }
}
