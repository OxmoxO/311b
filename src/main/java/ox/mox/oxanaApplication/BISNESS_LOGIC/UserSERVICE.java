package ox.mox.oxanaApplication.BISNESS_LOGIC;

import ox.mox.oxanaApplication.MODEL.User;

import java.util.List;

public interface UserSERVICE {
    List<User> findAll();
    User findById(long id);
    void saveUser(User user);
    void deleteById(long id);
    void update(long id, User user);
}
