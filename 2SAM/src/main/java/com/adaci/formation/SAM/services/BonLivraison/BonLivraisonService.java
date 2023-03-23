package com.adaci.formation.SAM.services.BonLivraison;


import com.adaci.formation.SAM.models.BonLivraison;

import java.util.List;
import java.util.Optional;

public interface BonLivraisonService {
    List<BonLivraison> getAll();
    BonLivraison create(BonLivraison bonLivraison);

    void delete(long id);

    BonLivraison update(long id, BonLivraison bonLivraison);

    Optional<BonLivraison> getById(long id);


}
