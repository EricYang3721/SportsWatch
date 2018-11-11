package se.sportswatch.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.sportswatch.Models.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {
    public Team findById(int id);

}
