package org.example.atelier_couplage.metier;

import org.example.atelier_couplage.dao.Etudiant;
import org.example.atelier_couplage.dao.EtudiantDAO;
import org.example.atelier_couplage.dao.IEtudiantDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantManager {
    private IEtudiantDAO etudiantDAO;

    public EtudiantManager(IEtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        for (Etudiant e : etudiantDAO.getAllEtudiants()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                System.out.println("Cet email est déjà utilisé.");
                return null;
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}
