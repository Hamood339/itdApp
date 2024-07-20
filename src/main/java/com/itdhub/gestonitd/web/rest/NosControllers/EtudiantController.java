package com.itdhub.gestonitd.web.rest.NosControllers;

import com.itdhub.gestonitd.domain.classes.Etudiants;
import com.itdhub.gestonitd.service.NosServices.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantController {

    //  @Autowired
    EtudiantService etudiantService;

    @GetMapping("/{etudiant}")
    public ResponseEntity<Etudiants> etudiant(@PathVariable Etudiants etudiant) {
        Etudiants student = etudiantService.infoEtudiant();
        return ResponseEntity.ok(student);
    }
}
