package project;

public class UserService {
    private UserRepository userRepository;

    public UserService ( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    public void addUser ( User user ) {
        userRepository.addUser ( user );
    }

    public User getUserByUsername ( String username ) {
        return userRepository.getUserByUsername ( username );
    }


}
