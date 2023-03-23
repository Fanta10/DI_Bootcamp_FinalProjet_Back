package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.BonLivraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonLivraisonRepository extends JpaRepository<BonLivraison, Long> {
}
