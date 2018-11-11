package se.sportswatch.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se.sportswatch.Models.*;
import java.util.*;


public interface TeamService{
    List<Team> findAll();
    Team findById(int id);
}