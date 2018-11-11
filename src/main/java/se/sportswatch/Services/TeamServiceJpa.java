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
public class TeamServiceJpa implements TeamService{
    @Autowired
    private TeamRepository teamRepo;
    
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<Team> findAll(){
        return (List)this.teamRepo.findAll();
    }
    
    @Override
    public Team findById(int id){
        return this.teamRepo.findById(id);
    }
}