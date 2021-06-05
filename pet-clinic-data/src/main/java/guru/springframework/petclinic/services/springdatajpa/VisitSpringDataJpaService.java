package guru.springframework.petclinic.services.springdatajpa;

import guru.springframework.petclinic.model.Visit;
import guru.springframework.petclinic.repositories.VisitRepository;
import guru.springframework.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSpringDataJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSpringDataJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findByID(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit type) {
        return visitRepository.save(type);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits:: add);
        return visits;
    }

    @Override
    public void delete(Visit type) {
        visitRepository.delete(type);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
