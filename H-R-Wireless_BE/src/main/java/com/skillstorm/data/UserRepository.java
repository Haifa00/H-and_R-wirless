package com.skillstorm.data;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillstorm.beans.User;
// If we need -> import org.springframework.data.jpa.repository.Query;


@Repository
public interface UserRepository extends JpaRepository<User, String>{

	public Optional<User> findUser(User user);

	public User saveUser(User user);

	public User updateUser(User user);

	public User deleteUser(User user);
}
// If we need  -> @Query(value = "select * from movies where rating > ?1", nativeQuery = true)