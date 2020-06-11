package com.sino.sdn.dci.application.services.login;

import com.sino.sdn.dci.application.services.login.dto.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface LoginUserRepository extends JpaRepository<LoginUser,Long> {
}
