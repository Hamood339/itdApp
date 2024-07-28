package com.itdhub.gestonitd.service.NosServices;

import com.itdhub.gestonitd.domain.NosClasses.SalleDeClasse;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalleDeClasseService {

    private final SalleDeClasseRepository classroomRepository;

    @Autowired
    public SalleDeClasseController(SalleDeClasseRepository salleDeClasseRepository) {
        this.SalleDeClasseController = salleDeClasseRepository;
    }

    public List<SalleDeClasse> findAll() {
        return salleDeClasseRepository.findAll();
    }

    public Optional<SalleDeClasse> findById(Long id) {
        return salleDeClasseRepository.findById(id);
    }

    public SalleDeClasse save(SalleDeClasse classroom) {
        return salleDeClasseRepository.save(classroom);
    }

    public void deleteById(Long id) {
        salleDeClasseRepository.deleteById(id);
    }
}
