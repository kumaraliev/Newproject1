import company.Gender;
import impl.UserServiceImpl;
import model.User;
import service.UserService;

public class Main {
    public static void main(String[] args) {


            User user = new User(1, "Kumar", "Aliev",Gender.MALE);
            User user1 = new User(2, "Azalya", "Alieva", Gender.FEMALE);
            User user2 = new User(3, "Anas","Aliev", Gender.MALE);

            UserService userService = new UserServiceImpl();
            userService.addUser(user);
            userService.addUser(user1);
            userService.addUser(user2);
            userService.findById(3);
            userService.getAllUsers();

           try {
               userService.findById(3);
           }catch (Exception e){
               System.out.println(e.getMessage());
        }
        try {
            userService.deleteUserById(5);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        }
}