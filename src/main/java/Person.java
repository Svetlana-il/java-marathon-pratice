public class Person<personInfo> {
    public String id;
    public String name;
    public Friend friend;
    public Photo photo;

    public Person(String newId, String newname) {
        this.id = newId;
        this.name = newname;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String toString() {
        String personInfo = "Person.Id:" + this.id + ", Name:" + this.name;
        if (this.friend != null && this.photo != null) {
            personInfo = personInfo + ", Friend " + this.friend + ", Photo" + this.photo;
        } else if (this.friend != null) {
            personInfo = personInfo + ", Friend " + this.friend + "NO PHOTO";
        } else if (this.photo != null) {
            personInfo = personInfo + ", NO FRIEND" + ", Photo" + this.photo;
        } else
            personInfo = personInfo + ", NO FRIEND" + ", NO PHOTO";

        return personInfo;
}
}
