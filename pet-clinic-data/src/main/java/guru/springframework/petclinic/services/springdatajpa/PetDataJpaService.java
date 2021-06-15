package guru.springframework.petclinic.services.springdatajpa;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.repositories.PetRepository;
import guru.springframework.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetDataJpaService implements PetService {

    private  final  PetRepository petRepository;

    public PetDataJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findByID(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet type) {
        return petRepository.save(type);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
         petRepository.findAll().forEach(pets::add);
         return pets;

    }

    @Override
    public void delete(Pet type) {
        petRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
