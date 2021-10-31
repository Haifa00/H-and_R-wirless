package com.skillstorm.data;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.skillstorm.beans.User;
//import org.springframework.data.jpa.repository.Query;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query(value="select * From users Where userName = ?1",nativeQuery = true)
	public List<User> findByUsername(String username);

	// save method it's already built in

//	public User save(User user);

//	public User updateUser(User user);

//	public User deleteUser(User user);
}
// If we need  -> @Query(value = "select * from movies where rating > ?1", nativeQuery = true)