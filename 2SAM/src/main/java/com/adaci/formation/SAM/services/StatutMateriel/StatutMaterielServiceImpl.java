package com.adaci.formation.SAM.services.StatutMateriel;

import com.adaci.formation.SAM.models.StatutMateriel;
import com.adaci.formation.SAM.repository.StatutMaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatutMaterielServiceImpl implements StatutMaterielService{
    @Autowired
    StatutMaterielRepository statutMaterielRepository;
    @Override
    public List<StatutMateriel> getAll() {
        return statutMaterielRepository.findAll();
    }

    @Override
    public StatutMateriel create(StatutMateriel statutMateriel) {
        return statutMaterielRepository.save(statutMateriel);
    }

    @Override
    public void delete(long id) {
        statutMaterielRepository.deleteById(id);

    }

    @Override
    public StatutMateriel update(long id, StatutMateriel statutMateriel) {
        return statutMaterielRepository.save(statutMateriel);
    }

    @Override
    public Optional<StatutMateriel> getByLibelle(String libelle) {
        return statutMaterielRepository.findByLibelle(libelle);
    }
}
