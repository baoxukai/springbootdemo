package com.bxk.demo.service.impl;

import com.bxk.demo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author bao
 * @description 用户服务类<br>
 * @create 2019/8/6 23:38
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String getUser() {
        return "baoxukai";
    }
}
