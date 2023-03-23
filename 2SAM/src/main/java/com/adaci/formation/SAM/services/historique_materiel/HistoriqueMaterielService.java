package com.adaci.formation.SAM.services.historique_materiel;

import com.adaci.formation.SAM.models.Employe;
import com.adaci.formation.SAM.models.HistoriqueMateriel;
import com.adaci.formation.SAM.models.Materiel;
import com.adaci.formation.SAM.models.StatutMateriel;

import java.util.List;
import java.util.Optional;

public interface HistoriqueMaterielService {
    String getAll();
    HistoriqueMateriel create(HistoriqueMateriel historiqueMateriel);

    void delete(long id);

    HistoriqueMateriel update(long id, HistoriqueMateriel historiqueMateriel);

    Optional<HistoriqueMateriel> getByEmploye(Employe employe);
    Optional<HistoriqueMateriel> getByMateriel(Materiel materiel);
    int duree(String mater);

}
