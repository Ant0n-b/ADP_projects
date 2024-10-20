import java.util.Arrays;
import java.util.List;

public class ChatApplication {

    public static void main(String[] args) {
        IMediator chatRoom = new ChatRoom();

        User user1 = new BasicUser(chatRoom, "Alice");
        User user2 = new BasicUser(chatRoom, "Bob");
        User user3 = new BasicUser(chatRoom, "Charlie");
        User user4 = new BasicUser(chatRoom, "Dave");

        User admin = new AdminUser(chatRoom, "Admin");

         
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);
        chatRoom.addUser(admin);

          
        user1.send("Hello everyone!");

            
        user2.sendPrivate("Hey Charlie!", user3);

          
        List<User> group = Arrays.asList(user1, user3, user4);
        user2.sendGroup("Hello group!", group);

          
        admin.kickUser(user3);

            
        user3.send("Am I still here?");
    }
}
