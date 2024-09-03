package ideas.fb.fb_data;

import ideas.fb.fb_data.dto.Post;
import ideas.fb.fb_data.entity.ApplicationUser;
import ideas.fb.fb_data.repositories.PostRepository;
import ideas.fb.fb_data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FbDataApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(FbDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		TODO: Save user

//		ApplicationUser user1 = userRepository.save(new ApplicationUser(0,"John Doe", "john@gmail.com", "john123","https://cdn1.iconfinder.com/data/icons/user-pictures/101/malecostume-1024.png"));
//		System.out.println(user1);

//		TODO: Save post

//		Post post1 = postRepository.save(new Post(0,"My first post.", new ApplicationUser(1,null,null,null,null)));
//		System.out.println(post1);

//		TODO: Get all Posts

//		List<Post> posts = postRepository.findBy();
//
//		for (Post post: posts) {
//			System.out.println("Post Id=" + post.getPostId());
//			System.out.println("Post Body=" + post.getPostBody());
//			System.out.println("User Id=" + post.getUser().getUserId());
//			System.out.println("User Name=" + post.getUser().getUserName());
//		}

//		TODO: Get all Posts for a User

		List<Post> posts = postRepository.findByUser(new ApplicationUser(1,null,null,null,null));

		for (Post post: posts) {
			System.out.println("Post Id=" + post.getPostId());
			System.out.println("Post Body=" + post.getPostBody());
			System.out.println("User Id=" + post.getUser().getUserId());
			System.out.println("User Name=" + post.getUser().getUserName());
		}

	}
}
