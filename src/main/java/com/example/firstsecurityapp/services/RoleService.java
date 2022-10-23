package com.example.firstsecurityapp.services;

import com.example.firstsecurityapp.model.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RoleService {

    @Transactional(readOnly = true)
    List<Role> listRoles();
}
