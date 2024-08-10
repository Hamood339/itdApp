package com.itdhub.gestonitd.web.rest.NosControllers;

import com.itdhub.gestonitd.domain.NosClasses.Certifications;
import com.itdhub.gestonitd.domain.NosClasses.Etudiant;
import com.itdhub.gestonitd.service.NosServices.CertifsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CertifsController {

    @Autowired
    private CertifsService certifsService;

    @GetMapping("/api/certifs")
    public List<Certifications> getCertifs() {
        certifsService.getCertifs();
        return getCertifs();
    }

    @PostMapping("/api/certifs")
    public void addCertifs(@RequestBody Certifications certifs) {
        certifsService.addCertifsByName();
    }

    @PutMapping("/api/certifs/{name}")
    public void updateCertifs(@RequestBody Certifications certifications, @PathVariable String name) {
        certifsService.updateCertifs(certifications, name);
    }
}
