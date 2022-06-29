package infrastructure.repositories;

import model.User.User;
import model.User.UserCollection;

public class MongoDBUserCollection implements UserCollection {
    @Override
    public User getUser (String userID) {
        throw new UnsupportedOperationException();
    }
}
