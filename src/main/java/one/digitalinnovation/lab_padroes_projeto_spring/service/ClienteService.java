package one.digitalinnovation.lab_padroes_projeto_spring.service;

import one.digitalinnovation.lab_padroes_projeto_spring.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    Cliente inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
