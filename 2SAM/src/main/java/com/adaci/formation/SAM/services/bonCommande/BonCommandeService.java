package com.adaci.formation.SAM.services.bonCommande;

import com.adaci.formation.SAM.models.BonCommande;

import java.util.List;
import java.util.Optional;

public interface BonCommandeService {
    List<BonCommande> getAll();
    BonCommande create(BonCommande bonCommande);

    void delete(long id);
   // Optional<BonCommande> getById(long id);
    BonCommande update(long id, BonCommande bonCommande);

    Optional<BonCommande> getById(long id);

    BonCommande update(long id);
}
