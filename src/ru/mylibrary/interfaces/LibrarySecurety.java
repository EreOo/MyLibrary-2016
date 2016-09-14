package ru.mylibrary.interfaces;

import ru.mylibrary.obj.User;

/**
 * Created by Vladimir on 14.09.16.
 */
public interface LibrarySecurety {

    boolean login(User user);
    void logout(User user);

}
