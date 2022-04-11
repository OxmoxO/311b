package ox.mox.oxanaApplication.BisnessLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ox.mox.oxanaApplication.Repositories.UserRepository;
import ox.mox.oxanaApplication.Model.User;

import java.util.List;

@Service
public class UserService_Impl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService_Impl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userRepository.update(user);
    }

}
