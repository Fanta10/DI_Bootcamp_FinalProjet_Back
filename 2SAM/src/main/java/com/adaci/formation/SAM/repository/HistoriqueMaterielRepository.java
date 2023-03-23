package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.Employe;
import com.adaci.formation.SAM.models.HistoriqueMateriel;
import com.adaci.formation.SAM.models.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HistoriqueMaterielRepository extends JpaRepository<HistoriqueMateriel, Long> {

    Optional<HistoriqueMateriel> findByMateriel(Materiel materiel);
    Optional<Employe> findByEmploye(Employe employe);

/*
    @Query(value="SELECT ", nativeQuery = true)
    public Double duree();

 */
}
