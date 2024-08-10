package com.itdhub.gestonitd.service.NosServices;

import com.itdhub.gestonitd.domain.NosClasses.Etudiant;
import com.itdhub.gestonitd.repository.EtudiantRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

    Etudiant etudiant = new Etudiant();

    @Autowired
    EtudiantRepository etudiantRepository;

    private static ArrayList<Etudiant> etudiants = new ArrayList<>(
        Arrays.asList(
            new Etudiant(1, "Diallo", "Ahmad", "Dakar", "ahmadudu339@gmail.com")
            // new Etudiant(2, "Diop", "moussa ", "Dakar", "diop21@gmail.com"),
            // new Etudiant(3, "sane", "malick", "Dakar", "sane45@gmail.com"),
            // new Etudiant(4, "sene", "fatou", "Dakar", "fatou78@gmail.com")
        )
    );

    public List<Etudiant> getEtudiant() {
        return etudiants;
    }

    public Etudiant getById(Long id) {
        return etudiants.stream().filter(etudiants -> etudiants.getId() == id).findFirst().orElse(null);
    }

    public void deleteEtudiantById(Long id) {
        etudiants.removeIf(etudiants -> etudiants.getId() == id);
    }

    public void addEtudiant() {
        //etudiantRepository.save(etudiant);
        etudiants.add(etudiant);
    }

    public void updateEtudiant(Etudiant etudiant, long id) {
        etudiants.forEach(etudiant1 -> {
            if (etudiant1.getId() == id) {
                etudiants.set(etudiants.indexOf(etudiant1), etudiant);
            }
        });
    }
}
