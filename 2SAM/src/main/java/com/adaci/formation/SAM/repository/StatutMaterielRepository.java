package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.StatutMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatutMaterielRepository extends JpaRepository<StatutMateriel, Long> {
    Optional<StatutMateriel> findByLibelle(String libelle);
}
