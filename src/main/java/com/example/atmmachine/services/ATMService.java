package com.example.atmmachine.services;

import com.example.atmmachine.entities.ATM;
import com.example.atmmachine.entities.User;
import com.example.atmmachine.utils.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface ATMService {
      ApiResponse validateAtmPin(User user, ATM atm );

}
