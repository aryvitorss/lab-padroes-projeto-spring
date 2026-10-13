package one.digitalinnovation.lab_padroes_projeto_spring.controller;

import one.digitalinnovation.lab_padroes_projeto_spring.model.Cliente;
import one.digitalinnovation.lab_padroes_projeto_spring.service.ClienteService;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>>buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente>buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente, UriComponentsBuilder uriBuilder){
        var clienteInserido = clienteService.inserir(cliente);

        URI uri = uriBuilder.path("clientes/{id}")
        .buildAndExpand(clienteInserido.getId()).toUri();
             
        return ResponseEntity.created(uri).body(clienteInserido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> Atualizacao(@PathVariable Long id,
                                               @RequestBody Cliente cliente){
        clienteService.atualizar(id,cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> Deletar(@PathVariable Long id){
        clienteService.deletar(id);
        return ResponseEntity.noContent().build() ;
    }

}
