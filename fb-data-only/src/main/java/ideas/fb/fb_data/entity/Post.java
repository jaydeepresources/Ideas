package ideas.fb.fb_data.entity;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer postId;
    private String postBody;

    @ManyToOne()
    @JoinColumn(name = "userId")
    ApplicationUser user;

    Post(){

    }

    public Post(Integer postId, String postBody, ApplicationUser user) {
        this.postId = postId;
        this.postBody = postBody;
        this.user = user;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public ApplicationUser getUser() {
        return user;
    }

    public void setUser(ApplicationUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postBody='" + postBody + '\'' +
                ", user=" + user +
                '}';
    }
}
