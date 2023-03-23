package com.adaci.formation.SAM.services.materiel;

import com.adaci.formation.SAM.models.Materiel;
import com.adaci.formation.SAM.repository.HistoriqueMaterielRepository;
import com.adaci.formation.SAM.repository.MaterielRepository;
import com.adaci.formation.SAM.services.historique_materiel.HistoriqueMaterielService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class MaterielServiceImpl implements MaterielService{
    @Autowired
    MaterielRepository materielRepository;

    @Autowired
    private HistoriqueMaterielService historiqueMaterielService;
    @Override
    public List<Materiel> getAll() {
        return materielRepository.findAll();
    }

    @Override
    public Materiel create(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    @Override
    public void delete(long id) {
        materielRepository.deleteById(id);

    }

    @Override
    public Materiel update(long id, Materiel materiel) {
        return null;
    }

    @Override
    public Optional<Materiel> getByCode(String code) {
        return materielRepository.findByCode(code);
    }


}
