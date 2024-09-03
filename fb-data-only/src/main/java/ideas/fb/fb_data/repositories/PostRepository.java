package ideas.fb.fb_data.repositories;

import ideas.fb.fb_data.entity.ApplicationUser;
import ideas.fb.fb_data.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Integer> {

    List<ideas.fb.fb_data.dto.Post> findBy();
    List<ideas.fb.fb_data.dto.Post> findByUser(ApplicationUser user);

}