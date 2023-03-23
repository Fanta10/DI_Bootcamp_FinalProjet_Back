package com.adaci.formation.SAM.services.fournisseur;

import com.adaci.formation.SAM.models.Fournisseur;
import com.adaci.formation.SAM.repository.FourisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurServiceImpl implements FournisseurService{
    @Autowired
    FourisseurRepository fourisseurRepository;
    @Override
    public List<Fournisseur> getAll() {
        return fourisseurRepository.findAll();
    }

    @Override
    public Fournisseur create(Fournisseur fournisseur) {
        return fourisseurRepository.save(fournisseur);
    }

    @Override
    public void delete(long id) {
        fourisseurRepository.deleteById(id);

    }

    @Override
    public Fournisseur update(long id, Fournisseur fournisseur) {
        return fourisseurRepository.save(fournisseur);
    }

    @Override
    public Optional<Fournisseur> getByNom(String nom) {
        return fourisseurRepository.findByNom(nom);
    }
}
