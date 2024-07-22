package com.itdhub.gestonitd.service.NosServices;

import com.itdhub.gestonitd.domain.classes.Etudiant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

    Etudiant etudiant = new Etudiant();

    public List<Etudiant> getEtudiants() {
        List<Etudiant> etudiants = new ArrayList<>();

        etudiant.setNom("Diallo");
        etudiant.setPrenom("Ahmadou");
        etudiant.setAdresse("Dakar");
        etudiant.setEmail("ahmadou@gmail.com");
        etudiants.add(etudiant);
        return etudiants;
    }
}
