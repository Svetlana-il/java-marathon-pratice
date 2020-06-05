import java.util.Objects;

public class Friend {
    public String name;

    public Friend(String newname){
        this.name=newname;

    }
    public  String toString(){
        String result="Friend.name:"+this.name;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return name.equals(friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

