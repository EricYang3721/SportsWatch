package se.sportswatch.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se.sportswatch.Models.*;
import java.util.*;

public interface UserService{
    List<User> findAll();
    User findByName(String name);
    User findById(Long id);
}