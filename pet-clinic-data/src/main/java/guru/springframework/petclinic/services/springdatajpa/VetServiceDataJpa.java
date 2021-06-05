package guru.springframework.petclinic.services.springdatajpa;


import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.repositories.VetRepository;
import guru.springframework.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetServiceDataJpa implements VetService {
    private final VetRepository vetRepository;

    public VetServiceDataJpa(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }


    @Override
    public Vet findByID(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet type) {
        return vetRepository.save(type);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Vet type) {
        vetRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
