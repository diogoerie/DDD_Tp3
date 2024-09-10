package com.example.petfriends.repositories;

import com.example.petfriends.models.ConsultaAgregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaAgregado, Long> {
}
