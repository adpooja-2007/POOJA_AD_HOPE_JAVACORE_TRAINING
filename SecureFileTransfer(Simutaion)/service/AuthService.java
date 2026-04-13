package service;

import exception.AuthenticationException;
import model.User;
import repository.UserRepository;
import util.LoggerUtil;

public class AuthService {
    private UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String userId, String password) throws AuthenticationException {
        User user = userRepository.findByUserId(userId);
        if (user == null || !user.getPassword().equals(password)) {
            LoggerUtil.error("Authentication failed for user: " + userId);
            throw new AuthenticationException("Invalid user ID or password.");
        }
        LoggerUtil.info("User " + userId + " authenticated successfully.");
        return true;
    }
}
