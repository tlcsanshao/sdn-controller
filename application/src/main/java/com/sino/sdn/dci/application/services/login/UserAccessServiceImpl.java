package com.sino.sdn.dci.application.services.login;

import com.sino.sdn.dci.application.services.login.dto.LoginRequest;
import com.sino.sdn.dci.application.services.login.dto.LoginUser;
import com.sino.sdn.dci.application.services.login.dto.UserData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserAccessServiceImpl implements UserAccessService {


    private static final Logger LOG = LoggerFactory.getLogger(UserAccessServiceImpl.class);

    private final Map<String, UserData> sessions;
    private final Map<String, UserData> users;

    public Map<String, UserData> getSessions() {
        return sessions;
    }

    public Map<String, UserData> getUsers() {
        return users;
    }

    public UserAccessServiceImpl() {
        LOG.info("----------------------------------------------");
        this.sessions = new ConcurrentHashMap<>();
        this.users = new HashMap<>();
//        List<LoginUser> list = loginUserRepository.findAll();
//
//        for(LoginUser loginUser:list){
//            this.users.put(loginUser.getUsername(),new UserData(loginUser.getUsername(),loginUser.getPassword()));
//        }

//        this.users.put("bob", new UserData("bob", "secret"));
//        this.users.put("alice", new UserData("alice", "secret"));



    }

    @Override
    public Optional<UserData> login(String sessionId, LoginRequest loginRequest) {
        UserData userData = users.get(loginRequest.getUserName());
        if (userData != null && userData.verifyPassword(loginRequest.getPassword())) {
            LOG.info("login OK: {} {}", sessionId, loginRequest.getUserName());
            sessions.put(sessionId, userData);
            return Optional.of(userData);
        }
        LOG.info("login Failed: {} {}", sessionId, loginRequest.getUserName());
        return Optional.empty();
    }

    @Override
    public Optional<UserData> isAuthenticated(String sessionId) {
        return Optional.ofNullable(sessions.get(sessionId));
    }

    @Override
    public void logout(String sessionId) {
        LOG.info("logout: {}", sessionId);
        sessions.remove(sessionId);
    }

}
