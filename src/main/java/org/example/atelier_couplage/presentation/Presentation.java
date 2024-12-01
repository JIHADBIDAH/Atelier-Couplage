package org.example.atelier_couplage.presentation;

import org.example.atelier_couplage.dao.Etudiant;
import org.example.atelier_couplage.dao.EtudiantDAO;
import org.example.atelier_couplage.dao.EtudiantDAODictionary;
import org.example.atelier_couplage.dao.IEtudiantDAO;
import org.example.atelier_couplage.metier.EtudiantManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Presentation {
    public static void main(String[] args) {
        IEtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager manager1 = new EtudiantManager(etudiantDAO);

        IEtudiantDAO etudiantDAODictionary = new EtudiantDAODictionary();
        EtudiantManager manager2 = new EtudiantManager(etudiantDAODictionary);

        // Tester l'ajout d'étudiants dans les deux versions
        manager1.addEtudiant(new Etudiant("1", "Nom1", "Prenom1", "email1@example.com"));
        manager2.addEtudiant(new Etudiant("2", "Nom2", "Prenom2", "email2@example.com"));

        // Afficher tous les étudiants
        System.out.println("Étudiants dans la liste : " + manager1.getAllEtudiants());
        System.out.println("Étudiants dans le dictionnaire : " + manager2.getAllEtudiants());
    }
}
