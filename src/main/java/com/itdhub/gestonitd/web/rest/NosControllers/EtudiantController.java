package com.itdhub.gestonitd.web.rest.NosControllers;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import com.itdhub.gestonitd.domain.NosClasses.Etudiant;
import com.itdhub.gestonitd.service.NosServices.EtudiantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/api/etudiant")
    public List<Etudiant> getEtudiant() {
        return etudiantService.getEtudiant();
    }

    @GetMapping("/api/etudiant/{id}")
    public Etudiant getStudentById(@PathVariable long id) {
        return etudiantService.getById(id);
    }

    @DeleteMapping("/api/etudiant/{id}")
    public void deleteEtudiant(@PathVariable long id) {
        etudiantService.deleteEtudiantById(id);
    }

    @PostMapping("/api/etudiant")
    public void addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.addEtudiant();
    }

    @PutMapping("/api/etudiant/{id}")
    public void updateEtudiant(@RequestBody Etudiant etudiant, @PathVariable long id) {
        etudiantService.updateEtudiant(etudiant, id);
    }
}
