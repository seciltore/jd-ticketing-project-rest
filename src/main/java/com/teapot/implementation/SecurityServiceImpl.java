package com.teapot.implementation;

import com.teapot.entity.User;
import com.teapot.entity.common.UserPrincipal;
import com.teapot.repository.UserRepository;
import com.teapot.service.SecurityService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class SecurityServiceImpl implements SecurityService {

    private UserRepository userRepository;

    public SecurityServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userRepository.findByUserName(s);

        if(user==null){
            throw new UsernameNotFoundException("This user does not exists");
        }

        return new UserPrincipal(user);
    }
}
