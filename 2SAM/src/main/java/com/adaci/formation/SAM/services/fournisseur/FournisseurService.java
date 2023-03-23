package com.adaci.formation.SAM.services.fournisseur;

import com.adaci.formation.SAM.models.Employe;
import com.adaci.formation.SAM.models.Fournisseur;

import java.util.List;
import java.util.Optional;

public interface FournisseurService {
    List<Fournisseur> getAll();
    Fournisseur create(Fournisseur fournisseur);

    void delete(long id);

    Fournisseur update(long id, Fournisseur fournisseur);

    Optional<Fournisseur> getByNom(String nom);
}
