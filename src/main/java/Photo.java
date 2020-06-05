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
}
