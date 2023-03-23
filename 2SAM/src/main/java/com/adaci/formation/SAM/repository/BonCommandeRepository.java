package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.BonCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonCommandeRepository extends JpaRepository<BonCommande, Long> {
}
