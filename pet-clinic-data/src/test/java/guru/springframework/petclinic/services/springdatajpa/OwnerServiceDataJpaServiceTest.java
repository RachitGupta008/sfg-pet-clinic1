package guru.springframework.petclinic.services.springdatajpa;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerServiceDataJpaServiceTest {
    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerServiceDataJpaService ownerServiceDataJpaService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {
        Owner returnOwner = Owner.builder().address("kakka").build();
        returnOwner.setLastName("Last");

        when(ownerServiceDataJpaService.findByLastName(any())).thenReturn(returnOwner);
        assertEquals(ownerServiceDataJpaService.findByLastName("Last").getLastName(), "Last");
    }

    @Test
    void findByID() {
    }

    @Test
    void save() {
    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}