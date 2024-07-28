package com.itdhub.gestonitd.web.rest.NosControllers;

import com.itdhub.gestonitd.domain.NosClasses.SalleDeClasse;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/salleDeClasse")
public class SalleDeClasseController {

    private final SalleDeClasseService salleDeClasseService;

    @Autowired
    public SalleDeClasseController(SalleDeClasseService salleDeClasseService) {
        this.salleDeClasseService = salleDeClasseService;
    }

    @GetMapping
    public List<SalleDeClasse> getAllClassrooms() {
        return salleDeClasseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalleDeClasse> getClassroomById(@PathVariable Long id) {
        Optional<SalleDeClasse> classroom = salleDeClasseService.findById(id);
        return classroom.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public SalleDeClasse createSalleDeClasse(@RequestBody SalleDeClasse salleDeClasse) {
        return salleDeClasseService.save(salleDeClasse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalleDeClasse> updateClassroom(@PathVariable Long id, @RequestBody SalleDeClasse salleDeClasseDetails) {
        Optional<SalleDeClasse> classroomOptional = salleDeClasseService.findById(id);
        if (classroomOptional.isPresent()) {
            SalleDeClasse salleDeClasse = classroomOptional.get();
            salleDeClasseService.setName(salleDeClasseDetails.getName());
            salleDeClasseService.setLocation(salleDeClasseDetails.getLocation());
            salleDeClasseService.setCapacity(salleDeClasseDetails.getCapacity());
            salleDeClasseService.setEquipment(salleDeClasseDetails.getEquipment());
            return ResponseEntity.ok(salleDeClasseService.save(salleDeClasseService));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassroom(@PathVariable Long id) {
        salleDeClasseService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
