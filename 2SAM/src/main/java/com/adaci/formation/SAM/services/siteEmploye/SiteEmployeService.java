package com.adaci.formation.SAM.services.siteEmploye;


import com.adaci.formation.SAM.models.SiteEmploye;

import java.util.List;
import java.util.Optional;

public interface SiteEmployeService {
    List<SiteEmploye> getAll();
    SiteEmploye create(SiteEmploye siteEmploye);

    void delete(long id);

    SiteEmploye update(long id, SiteEmploye siteEmploye);

    Optional<SiteEmploye> getByLibelle(String libelle);

}
