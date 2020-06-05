import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String... args) {

        Person pers = new Person("123", "Ivan");
        System.out.println("Это человек" + pers.toString());

        Friend friend = new Friend("Vasiliy");
        System.out.println("Это друг" + friend);

        pers.addFriend(friend);
        System.out.println("Этот человек с другом" + pers);

        Photo photo=new Photo("I", "https://vk.com/photo37414074_289284512?all=1");
        System.out.println("My photo" + photo);

         pers.addPhoto(photo);
        System.out.println("Этот человекс другом и фото" +pers);

        List<String>ListofNames=new ArrayList<>();
        ListofNames.add("Petr");
        ListofNames.add("Vasilii");
        ListofNames.add("Den");
        ListofNames.add("Petr");
        ListofNames.add("Petr");

        System.out.println(ListofNames);
        System.out.println(ListofNames.contains("Den"));

        Set<String>setofNames=new HashSet<>();
        setofNames.add("Petr");
        setofNames.add("Vasilii");
        setofNames.add("Valia");
        setofNames.add("Den");

        System.out.println(setofNames);

    }
}




