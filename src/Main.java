import company.Gender;
import impl.UserServiceImpl;
import model.User;
import service.UserService;

public class Main {
    public static void main(String[] args) {

        try {
            User user = new User(1, "Kumar", "Aliev",Gender.MALE);
            User user1 = new User(2, "Azalya", "Alieva", Gender.FEMALE);
            User user2 = new User(3, "Anas","Aliev", Gender.MALE);

            UserService userService = new UserServiceImpl();
            userService.addUser(user);
            userService.addUser(user1);
            userService.addUser(user2);
            userService.findById(3);
            userService.getAllUsers();

            System.out.println(userService.findById(3));
            userService.getAllUsers();

        }catch (RuntimeException runtimeException){
            System.out.println(runtimeException.getMessage());
        }


    }
}