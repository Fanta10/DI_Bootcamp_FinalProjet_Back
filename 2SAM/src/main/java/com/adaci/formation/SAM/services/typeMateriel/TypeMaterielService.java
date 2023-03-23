package com.adaci.formation.SAM.services.typeMateriel;

import com.adaci.formation.SAM.models.StatutMateriel;
import com.adaci.formation.SAM.models.TypeMateriel;

import java.util.List;
import java.util.Optional;

public interface TypeMaterielService {
    List<TypeMateriel> getAll();
    TypeMateriel create(TypeMateriel typeMateriel);

    void delete(long id);

    TypeMateriel update(long id, TypeMateriel typeMateriel);

    Optional<TypeMateriel> getByLibelle(String libelle);
}
