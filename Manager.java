import java.awt.*;
import java.util.*;
import java.util.List;

public class Manager {
    private static Map<String, User> userMap = new HashMap<>();

    boolean addNewUser(User user) {
        if (userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователь с логином " + user.getLogin() + " уже существует");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println(user.getLogin() + " вы успешно зарегестрировались");
            return true;
        }
    }

    boolean login(String login, String password) {
        if (!userMap.containsKey(login)) {
            System.out.println("Пользователя с логином " + login + " не существует");
            return false;
        } else if (userMap.get(login).getPassword().equals(password)) {
            System.out.println(login + " вы успешно вошли");
            return true;
        }
        return false;
    }

    boolean deleteUser(String login) {
        if (userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("Пользователь с логином " + login + " удален");
            return true;
        } else {
            System.out.println("Пользователь с логином " + login + " не существует");
            return false;
        }
    }

    void getAllUsers() {
        System.out.println(userMap.keySet());
    }

    void getAllUsers(String sortcriterion) {
        switch (sortcriterion) {
            case "login":
                Map<String, User> sortedByLoginMap = new TreeMap<>(userMap);
                System.out.println(sortedByLoginMap);
                break;
            case "date":
                UserDateComparator userDateComparator = new UserDateComparator();
                List<User> sortedByDateList = new ArrayList<>(userMap.values());
                sortedByDateList.sort(userDateComparator);
                System.out.println(sortedByDateList);
                break;

        }

    }

    boolean editUser(User user) {
        if (!userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователь с логином " + user.getLogin() + " уже существует");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println("Пользователь с логином " + user.getLogin() + " успешно обновлен");
            return true;
        }
    }
}