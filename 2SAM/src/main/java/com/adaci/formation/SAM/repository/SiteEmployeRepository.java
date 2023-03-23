package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.SiteEmploye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SiteEmployeRepository extends JpaRepository<SiteEmploye, Long> {
    Optional<SiteEmploye> findByLibelle(String libelle);
}
