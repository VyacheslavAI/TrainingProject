package com.max.test.interfaces;

import com.max.beans.User;

public interface TestRepo {

    void saveUser(User user);
    User findUser();
}
