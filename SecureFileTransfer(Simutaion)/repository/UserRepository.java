package repository;

import model.User;
import java.util.HashMap;

public class UserRepository {
    private HashMap<String, User> userMap = new HashMap<>();

    public void save(User user) {
        userMap.put(user.getUserId(), user);
    }

    public User findByUserId(String userId) {
        return userMap.get(userId);
    }
}
