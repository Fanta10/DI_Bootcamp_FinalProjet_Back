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
@Table(name="employee")
public class Employe{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="matricule", length = 35)
    private String matricule;
    @Column(name="nom", length = 35)
    private String nom;
    @Column(name="prenom", length = 35)
    private String prenom;
    @Column(name="email", length = 35, unique = true)
    private String email;
    @CreationTimestamp
    @Column(name="created_at", columnDefinition = "Date")
    private Date createdAt;
    @CreationTimestamp
    @Column(name="updated_at", columnDefinition = "Date")
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "SiteEmploye_id")
    private SiteEmploye siteEmploye;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public SiteEmploye getSiteEmploye() {
        return siteEmploye;
    }

    public void setSiteEmploye(SiteEmploye siteEmploye) {
        this.siteEmploye = siteEmploye;
    }
}
