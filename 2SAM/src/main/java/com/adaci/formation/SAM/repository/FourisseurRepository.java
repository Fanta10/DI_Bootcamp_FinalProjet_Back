package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FourisseurRepository extends JpaRepository<Fournisseur, Long> {
    Optional<Fournisseur> findByNom(String nom);
}
