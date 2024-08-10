package com.itdhub.gestonitd.service.NosServices;

import com.itdhub.gestonitd.domain.NosClasses.Certifications;
import com.itdhub.gestonitd.domain.NosClasses.Etudiant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertifsService {

    Certifications certifications = new Certifications(new Etudiant(), "certifsName", true);

    private static ArrayList<Certifications> certifs = new ArrayList<>(
        /* Arrays.asList(
            new Certifications(new Etudiant(),"IBM",true),
            new Certifications(new Etudiant(),"RedHat",true)
        )*/
    );

    public List<Certifications> getCertifs() {
        return certifs;
    }

    public void addCertifsByName() {
        certifs.add(new Certifications(new Etudiant(), "CertifsName", true));
    }

    public void updateCertifs(Certifications certifications, String name) {
        certifs.forEach(certifications1 -> {
            if (certifications1.getName() == name) {
                certifs.set(certifs.indexOf(certifications1), certifications);
            }
        });
    }
}
