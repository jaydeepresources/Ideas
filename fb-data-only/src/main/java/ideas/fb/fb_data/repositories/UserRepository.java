package ideas.fb.fb_data.repositories;

import ideas.fb.fb_data.entity.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ApplicationUser, Integer> {

}