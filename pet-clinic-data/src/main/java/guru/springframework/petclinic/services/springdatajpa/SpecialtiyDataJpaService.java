package guru.springframework.petclinic.services.springdatajpa;


import guru.springframework.petclinic.model.Speciality;
import guru.springframework.petclinic.repositories.SpecialityRepository;
import guru.springframework.petclinic.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtiyDataJpaService implements SpecialitiesService {
    private final SpecialityRepository specialityRepository;

    public SpecialtiyDataJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }


    @Override
    public Speciality findByID(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality type) {
        return specialityRepository.save(type);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public void delete(Speciality type) {
        specialityRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
