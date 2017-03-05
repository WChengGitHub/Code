package service.testService;

import mapper.UserMapper;
import model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 2017/3/4.
 */
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(UserModel userModel) {
        userMapper.insertUser(userModel);
    }
}
