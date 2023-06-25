package com.UrlHitCounter.UrlHitCounter.Service;

import com.UrlHitCounter.UrlHitCounter.Model.User;
import com.UrlHitCounter.UrlHitCounter.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String postUser(User user) {
        userRepo.userList.add(user);
        return "User Added Successfully !!!";
    }

    public String hitIncrement(Integer userId) {
        for(User user : userRepo.userList){
            if(user.getUserId().equals(userId)){   // question is eqauls for only string type
                user.setCount(user.getCount()+1);
                return "Hit SuccessFull";
            }
        }
        return "Invalid UserId.. ";
    }

    public User returnUser(String userName) {
        for(User user : userRepo.userList){
            if(user.getUserName().equals(userName)){
                return user;
            }
        }
        return null;
    }
}
