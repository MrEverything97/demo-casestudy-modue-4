package com.phuongnam.service;

import com.phuongnam.model.AppUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AppUserService {
    AppUser getUserByUsername(String username);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
