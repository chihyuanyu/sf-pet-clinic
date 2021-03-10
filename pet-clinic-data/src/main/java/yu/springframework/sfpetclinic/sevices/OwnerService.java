package yu.springframework.sfpetclinic.sevices;

import yu.springframework.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
