package com.adaci.formation.SAM.services.BonLivraison;

import com.adaci.formation.SAM.models.BonLivraison;
import com.adaci.formation.SAM.repository.BonLivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class BonLivraisonServiceImpl implements BonLivraisonService{
    @Autowired
    BonLivraisonRepository bonLivraisonRepository;
    @Override
    public List<BonLivraison> getAll() {
        return bonLivraisonRepository.findAll();
    }

    @Override
    public BonLivraison create(BonLivraison bonLivraison) {
        return bonLivraisonRepository.save(bonLivraison);
    }

    @Override
    public void delete(long id) {
        bonLivraisonRepository.deleteById(id);

    }

    @Override
    public BonLivraison update(long id, BonLivraison bonLivraison) {
        BonLivraison livraison = bonLivraisonRepository.findById(id).get();



        return null;
    }

    @Override
    public Optional<BonLivraison> getById(long id) {
        return bonLivraisonRepository.findById(id);
    }
}
