package com.itdhub.gestonitd.web.rest.NosControllers;

import com.itdhub.gestonitd.domain.NosClasses.Etudiant;
import com.itdhub.gestonitd.service.NosServices.EtudiantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/info")
    public List<Etudiant> getAllEtudiants() {
        etudiantService.getEtudiants();
        return etudiantService.getEtudiants();
    }
}
