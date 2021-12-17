package com.fang.service;

import com.fang.dao.RoleDao;
import com.fang.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> list (){
        return roleDao.list();
    }
}
