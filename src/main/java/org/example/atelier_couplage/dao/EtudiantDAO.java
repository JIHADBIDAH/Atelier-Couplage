package org.example.atelier_couplage.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EtudiantDAO implements IEtudiantDAO {
    private List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
}


