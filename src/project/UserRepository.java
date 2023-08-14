package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private Map<Integer, User> users = new HashMap<> ( );
    private int nextUserId = 1;

    public void addUser ( User user ) {
        user.setId ( nextUserId++ );
        users.put ( user.getId ( ), user );
    }

    public User getUserByUsername ( String username ) {
        for (User user : users.values ( )) {
            if ( user.getUsername ( ).equals ( username ) ) {
                return user;
            }
        }
        return null;
    }


}

