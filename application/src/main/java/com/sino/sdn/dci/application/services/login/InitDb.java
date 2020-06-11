package com.sino.sdn.dci.application.services.login;

import com.sino.sdn.dci.application.services.login.dto.LoginUser;
import com.sino.sdn.dci.application.services.login.dto.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitDb implements CommandLineRunner {
    @Autowired
    UserAccessServiceImpl userAccessService;

    @Autowired
    LoginUserRepository loginUserRepository;

    @Override
    public void run(String... args) throws Exception {

        List<LoginUser> list = loginUserRepository.findAll();

        for(LoginUser loginUser:list){
            userAccessService.getUsers().put(loginUser.getUsername(),new UserData(loginUser.getUsername(),loginUser.getPassword()));
        }
    }
}
