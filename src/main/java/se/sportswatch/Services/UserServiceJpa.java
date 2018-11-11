package se.sportswatch.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import se.sportswatch.Models.*;
import se.sportswatch.Repositories.*;
import java.util.*;

@Service
@Primary
public class UserServiceJpa implements UserService{
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private TeamRepository teamRepo;

    @Override
    public List<User> findAll(){
        return (List)this.userRepo.findAll();
    }

    
    
    @Override
    public User findByName(String name){
        return this.userRepo.findByName(name);
    }


    @Override
    public User findById(Long id){
        return userRepo.findById(id);
    }

}