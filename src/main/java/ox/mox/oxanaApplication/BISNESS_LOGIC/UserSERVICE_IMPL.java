package ox.mox.oxanaApplication.BISNESS_LOGIC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ox.mox.oxanaApplication.REPOSITORIES.UserPEROSITORY;
import ox.mox.oxanaApplication.MODEL.User;

import java.util.List;

@Service
public class UserSERVICE_IMPL implements UserSERVICE {

    @Autowired
    private UserPEROSITORY userPEROSITORY;

    @Override
    public List<User> findAll() {
        return userPEROSITORY.findAll();
    }

    @Override
    public User findById(long id) {
        return userPEROSITORY.findById(id);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userPEROSITORY.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteById(long id) {
        userPEROSITORY.deleteById(id);
    }

    @Transactional
    @Override
    public void update(long id, User user) {
        userPEROSITORY.update(id, user);
    }

}
