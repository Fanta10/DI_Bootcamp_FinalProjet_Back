package com.adaci.formation.SAM.services.StatutMateriel;

import com.adaci.formation.SAM.models.SiteEmploye;
import com.adaci.formation.SAM.models.StatutMateriel;

import java.util.List;
import java.util.Optional;

public interface StatutMaterielService {
    List<StatutMateriel> getAll();
    StatutMateriel create(StatutMateriel statutMateriel);

    void delete(long id);

    StatutMateriel update(long id, StatutMateriel statutMateriel);

    Optional<StatutMateriel> getByLibelle(String libelle);
}
