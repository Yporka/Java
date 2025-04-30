import java.time.LocalDate;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNewUser(new User("Misha", "12345", LocalDate.of(2020, 10, 10)));
        manager.addNewUser(new User("Vanya", "lolo", LocalDate.now()));
        manager.addNewUser(new User("Julia", "bylik", LocalDate.of(2021, 10, 10)));
        manager.addNewUser(new User("Irina", "test", LocalDate.of(2022, 10, 10)));
        manager.addNewUser(new User("Kira", "root", LocalDate.of(2023, 01, 01)));
        System.out.println();
        manager.getAllUsers("date");
        System.out.println();
        manager.editUser(new User("Misha", "555", LocalDate.now()));
    }
}
