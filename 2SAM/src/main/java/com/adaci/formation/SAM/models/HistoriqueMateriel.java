package com.adaci.formation.SAM.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="material_hystory")
public class HistoriqueMateriel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @CreationTimestamp
    @Column(name="created_at", columnDefinition = "Date")
    private Date createdAt;
    @CreationTimestamp
    @Column(name="updated_at", columnDefinition = "Date")
    private Date updatedAt;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Materiel_id")
    private Materiel materiel;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Employe_id")
    private Employe employe;
    @Column(name = "debutperiode_utilisation")
    private Date debutperiode_utilisation;
    @Column(name = "finperiode_utilisation")
    private  Date finperiode_utilisation;
    @Column(name = "statut_mat")
    private int statut;
    @Column(name = "longitude")
    private Double longitude;
   /* @Column(name = "duree_restante")
    private int duree_restante;

    */
    @Column(name = "latitude")
    private Double latitude;

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getDebutperiode_utilisation() {
        return debutperiode_utilisation;
    }

    public void setDebutperiode_utilisation(Date debutperiode_utilisation) {
        this.debutperiode_utilisation = debutperiode_utilisation;
    }

    public Date getFinperiode_utilisation() {
        return finperiode_utilisation;
    }

    public void setFinperiode_utilisation(Date finperiode_utilisation) {
        this.finperiode_utilisation = finperiode_utilisation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
