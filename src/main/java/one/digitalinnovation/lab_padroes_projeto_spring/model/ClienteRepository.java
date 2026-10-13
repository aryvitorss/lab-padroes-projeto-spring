package one.digitalinnovation.lab_padroes_projeto_spring.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
