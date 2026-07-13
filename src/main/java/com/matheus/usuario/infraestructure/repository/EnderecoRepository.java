package com.matheus.usuario.infraestructure.repository;

import com.lazari.aprendendo_spring.infraestructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
