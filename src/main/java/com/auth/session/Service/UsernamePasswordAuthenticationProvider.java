package com.auth.session.Service;

import com.auth.session.Repo.UserRepo;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class UsernamePasswordAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    private final UserRepo userRepo;

    public UsernamePasswordAuthenticationProvider(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        String password = authentication.getCredentials().toString();
        return userRepo.findByUserNameAndPassword(username, password);
    }

}
