package com.itdhub.gestonitd.repository;

import com.itdhub.gestonitd.domain.NosClasses.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {}
