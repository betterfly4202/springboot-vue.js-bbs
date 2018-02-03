package com.talsist.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.talsist.domain.User;
import com.talsist.repository.UserRepository;

@Component
public class CustomUserDetailService implements UserDetailsService {

    private UserRepository userRepo;

    public CustomUserDetailService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        User user = userRepo.findByUserId(userId);
        if (user == null) {
            throw new UsernameNotFoundException(userId);
        }
        return user;
    }

}
