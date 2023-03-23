package com.adaci.formation.SAM.services.typeMateriel;

import com.adaci.formation.SAM.models.TypeMateriel;
import com.adaci.formation.SAM.repository.TypeMaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeMaterielServiceImpl implements TypeMaterielService{
    @Autowired
    TypeMaterielRepository typeMaterielRepository;
    @Override
    public List<TypeMateriel> getAll() {
        return typeMaterielRepository.findAll();
    }

    @Override
    public TypeMateriel create(TypeMateriel typeMateriel) {
        return typeMaterielRepository.save(typeMateriel);
    }

    @Override
    public void delete(long id) {
        typeMaterielRepository.deleteById(id);

    }

    @Override
    public TypeMateriel update(long id, TypeMateriel typeMateriel) {
        return typeMaterielRepository.save(typeMateriel);
    }

    @Override
    public Optional<TypeMateriel> getByLibelle(String libelle) {
        return typeMaterielRepository.findByLibelle(libelle);
    }
}
