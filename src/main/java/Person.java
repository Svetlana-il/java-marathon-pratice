import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person<personInfo> {
    public String id;
    public String name;
    public List<Friend> friends=new ArrayList<>();
    public Set<Photo> photos=new HashSet<>();

    public Person(String newId, String newname) {
        this.id = newId;
        this.name = newname;
    }

    public void addFriend(Friend friend) {
        this.friends.add(friend);
    }

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
    }

    public String toString() {
        String personInfo = "Person.Id:" + this.id + ", Name:" + this.name;
        if (this.friends != null && this.photos != null && !friends.isEmpty() && !photos.isEmpty()) {
            personInfo = personInfo + ", Friend " + this.friends + ", Photo" + this.photos;
        } else if (this.friends != null && !friends.isEmpty()) {
            personInfo = personInfo + ", Friend " + this.friends + "NO PHOTO";
        } else if (this.photos != null && !photos.isEmpty()) {
            personInfo = personInfo + ", NO FRIEND" + ", Photo" + this.photos;
        } else
            personInfo = personInfo + ", NO FRIEND" + ", NO PHOTO";

        return personInfo;
}
}
