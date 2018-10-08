package se.sportswatch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.sportswatch.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface UserRepository extends CrudRepository<User, Integer> {

}
