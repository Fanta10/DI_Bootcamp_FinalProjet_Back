package com.adaci.formation.SAM.services.bonCommande;

import com.adaci.formation.SAM.models.BonCommande;
import com.adaci.formation.SAM.repository.BonCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BonCommandeServiceImpl implements BonCommandeService{
    @Autowired
    BonCommandeRepository bonCommandeRepository;
    @Override
    public List<BonCommande> getAll() {
        return bonCommandeRepository.findAll();
    }

    @Override
    public BonCommande create(BonCommande bonCommande) {
        return bonCommandeRepository.save(bonCommande);
    }

    @Override
    public void delete(long id) {
        bonCommandeRepository.deleteById(id);

    }

    @Override
    public BonCommande update(long id, BonCommande bonCommande) {
        return null;
    }

    @Override
    public Optional<BonCommande> getById(long id) {
        return bonCommandeRepository.findById(id);
    }

    @Override
    public BonCommande update(long id) {
        return null;
    }
}
