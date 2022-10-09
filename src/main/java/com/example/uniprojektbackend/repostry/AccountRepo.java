package com.example.uniprojektbackend.repostry;

import com.example.uniprojektbackend.model.Account;
import com.example.uniprojektbackend.model.CustomerUser;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;


public interface AccountRepo extends PagingAndSortingRepository<CustomerUser, UUID> {
      public Optional<CustomerUser> findByName(String email);
}
