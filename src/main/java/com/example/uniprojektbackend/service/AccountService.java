package com.example.uniprojektbackend.service;

import com.example.uniprojektbackend.model.Account;
import com.example.uniprojektbackend.model.CustomerUser;
import com.example.uniprojektbackend.repostry.AccountRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements UserDetailsService {
    @Autowired
    private AccountRepo accountRepo;

    public AccountService(AccountRepo accountRepo){
        this.accountRepo=accountRepo;
    }


    @Override
    public UserDetails loadUserByUsername(String username) {
       Optional<CustomerUser> user = accountRepo.findByName(username);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException(username);
        }
        CustomerUser infoUser= user.get();
        return new CustomerUser(infoUser.getId(),infoUser.getUsername(),infoUser.getUsername(),infoUser.getPassword());
    }
    private static List<GrantedAuthority> maptoGrantedAuthourty(){
        return new ArrayList<GrantedAuthority>();
    }

}
