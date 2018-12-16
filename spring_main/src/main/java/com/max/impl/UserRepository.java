package com.max.impl;

import com.max.beans.User;
import com.max.interfaces.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {//implements Repository {

//    @Autowired
//    JdbcOperations jdbcOperations;
//
//    @Autowired
//    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    public void createTable() {
//        jdbcOperations.execute("create table if not exists user(" +
//                "id mediumint not null auto_increment," +
//                "name char(30) not null," +
//                "primary key(id))");
//
//        jdbcOperations.update("insert into user(name) values('first book')");
//        jdbcOperations.update("insert into user(name) values('second book')");
//
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("id", 1);
//
//        namedParameterJdbcTemplate.update("update user set name='third book' where id=:id", map);

//
//        User user = jdbcOperations.queryForObject(
//                "select * from user where id = ?",
//                (rs,i) -> (new User(rs.getInt("id"), rs.getString("name"))),
//                1);
//
//
//        System.out.println(user.getId());
//        System.out.println(user.getName());
    //}

//    static class MyRowMapper implements RowMapper<User> {
//
//        public User mapRow(ResultSet resultSet, int i) throws SQLException {
//            return new User(resultSet.getInt("id"), resultSet.getString("name"));
//        }
//    }
}
