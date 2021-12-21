package com.fang.dao;

import com.fang.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Role> list(){
        return jdbcTemplate.query("select * from sys_role",new BeanPropertyRowMapper<>(Role.class));
    }
}
