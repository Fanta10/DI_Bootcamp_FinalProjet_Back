package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

    Optional<Employe> findByMatricule(String matricule);
    Optional<Employe> findByEmail(String email);
}
