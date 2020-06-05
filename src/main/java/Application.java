import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String... args) {

        Person pers = new Person("123", "Ivan");
        System.out.println("Это человек" + pers.toString());

        Friend friend = new Friend("Vasiliy");
        System.out.println("Это друг" + friend);

        pers.setFriend(friend);
        System.out.println("Этот человек с другом" + pers);

        Photo photo=new Photo("I", "https://vk.com/photo37414074_289284512?all=1");
        System.out.println("My photo" + photo);

         pers.setPhoto(photo);
        System.out.println("Этот человекс другом и фото" +pers);

        Set<String>setofNames=new HashSet<>();
        setofNames.add("Petr");
        setofNames.add("Vasilii");
        setofNames.add("Valia");
        setofNames.add("Den");

        System.out.println(setofNames);

    }
}




