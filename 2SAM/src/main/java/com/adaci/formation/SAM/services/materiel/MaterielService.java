package com.adaci.formation.SAM.services.materiel;

import com.adaci.formation.SAM.models.BonLivraison;
import com.adaci.formation.SAM.models.Materiel;

import java.util.List;
import java.util.Optional;

public interface MaterielService {
    List<Materiel> getAll();
    Materiel create(Materiel materiel);

    void delete(long id);

    Materiel update(long id, Materiel materiel);

    Optional<Materiel> getByCode(String code);




}
