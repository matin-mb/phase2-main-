package Sample;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    public String text ;
    public String user;
    public String photoAddress;
    public String filmAddress;

    public ArrayList<Reaction> reactions = new  ArrayList<Reaction>();
    public static ArrayList<Post> allPosts = new ArrayList<Post>();

    public LocalDateTime postTime;

    public Post(String text, String user) {
        this.text = text;
        this.user = user;
    }
    public ArrayList<String> allView =new ArrayList<String>();
    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "text='" + text + '\'' +
                ", user=" + user +
                '}';
    }
}
