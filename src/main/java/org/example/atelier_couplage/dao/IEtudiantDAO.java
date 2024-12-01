package org.example.atelier_couplage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEtudiantDAO {
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
}

