package ideas.fb.fb_data.dto;

import ideas.fb.fb_data.entity.ApplicationUser;

public interface Post {

    public Integer getPostId();
    public String getPostBody();

    public User getUser();

    interface User{
        public Integer getUserId();
        public String getUserName();
    }

}
