package com.itdhub.gestonitd.repository;

import com.itdhub.gestonitd.domain.NosClasses.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {}
