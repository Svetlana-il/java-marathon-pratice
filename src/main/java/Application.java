import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;

public class Application {

    public static void main(String... args) {
        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient);
        UserActor actor = new UserActor(37414074,"b5b40325d9ec3c6fe1104edb655f9149a27f96717db207adc5987119397bc903f5e782e433d9688a91286");


        //https://oauth.vk.com/authorize?client_id=7507234&display=page&redirect_uri=https://oauth.vk.com/blank.html&scope=friends,photos,status,email&response_type=token&v=5.107&state=123456
        //https://oauth.vk.com/blank.html#access_token=b5b40325d9ec3c6fe1104edb655f9149a27f96717db207adc5987119397bc903f5e782e433d9688a91286&expires_in=86400&user_id=37414074&email=svetek@inbox.ru&state=123456
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




