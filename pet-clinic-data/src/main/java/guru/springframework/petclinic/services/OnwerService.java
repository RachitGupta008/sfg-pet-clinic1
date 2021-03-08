package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OnwerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
