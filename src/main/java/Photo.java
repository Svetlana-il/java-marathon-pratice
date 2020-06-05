import java.util.Objects;

public class Photo {
    public String name;
    public String url;

    public Photo(String newname, String newurl) {
        this.name = newname;
        this.url = newurl;
    }

    public String toString() {
        String result = "Name " + this.name + ", URL" + this.url;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return url.equals(photo.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
}
