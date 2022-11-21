package com.wx.springboot.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.springboot.entity.User;
import com.wx.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper,User> {
//    @Autowired
//    private  UserMapper usermapper;

//    public int save(User user){
//        if(user.getId()==null){
//            return usermapper.insert(user);
//        }
//        else{
//            return usermapper.update(user);
//        }
//    }
    public boolean saveUser(User user) {
//        if(user.getId()==null){
//           return save(user);
//        }else{
//            return updateById(user);
//        }
//    }
      return saveOrUpdate(user);
    }

}
