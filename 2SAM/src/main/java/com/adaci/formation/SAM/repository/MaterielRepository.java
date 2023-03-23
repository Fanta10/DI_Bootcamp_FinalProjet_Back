package com.adaci.formation.SAM.repository;

import com.adaci.formation.SAM.models.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Long> {
    Optional<Materiel> findByCode(String code);
    @Query(value="SELECT code, libelle, marque, modele, s.libelle, t.libelle,  FROM material AS m JOIN material_type AS t ON m.id = t.id JOIN material_status AS s ON m.id = s..id", nativeQuery = true)
    public Double liste();
}
