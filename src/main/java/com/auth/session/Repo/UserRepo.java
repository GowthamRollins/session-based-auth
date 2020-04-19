package com.auth.session.Repo;

import com.auth.session.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    UserDetails findByUserNameAndPassword(String userName, String password);

}
