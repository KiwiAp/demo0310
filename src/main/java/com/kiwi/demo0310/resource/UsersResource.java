package com.kiwi.demo0310.resource;

import com.kiwi.demo0310.mapper.UsersMapper;
import com.kiwi.demo0310.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }
    @GetMapping("/all")
    public List<Users> getAll(){
        return usersMapper.findAll();
    }
}
