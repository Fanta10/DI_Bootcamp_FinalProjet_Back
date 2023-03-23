package com.adaci.formation.SAM.services.siteEmploye;

import com.adaci.formation.SAM.models.SiteEmploye;
import com.adaci.formation.SAM.repository.SiteEmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SiteEmployeServiceImpl implements SiteEmployeService{
    @Autowired
    SiteEmployeRepository siteEmployeRepository;
    @Override
    public List<SiteEmploye> getAll() {
        return siteEmployeRepository.findAll();
    }

    @Override
    public SiteEmploye create(SiteEmploye siteEmploye) {
        return siteEmployeRepository.save(siteEmploye);
    }

    @Override
    public void delete(long id) {
        siteEmployeRepository.deleteById(id);

    }

    @Override
    public SiteEmploye update(long id, SiteEmploye siteEmploye) {
        return siteEmployeRepository.save(siteEmploye);
    }

    @Override
    public Optional<SiteEmploye> getByLibelle(String libelle) {
        return siteEmployeRepository.findByLibelle(libelle);
    }
}
