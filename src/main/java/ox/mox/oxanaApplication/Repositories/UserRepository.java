package ox.mox.oxanaApplication.Repositories;

import ox.mox.oxanaApplication.Model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findById(long id);
    void saveUser(User user);
    void deleteById(long id);
    void update(User user);
}
