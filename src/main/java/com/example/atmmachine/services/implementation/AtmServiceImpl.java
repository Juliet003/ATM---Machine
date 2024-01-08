package com.example.atmmachine.services.implementation;

import com.example.atmmachine.entities.ATM;
import com.example.atmmachine.entities.User;
import com.example.atmmachine.repository.UserRepository;
import com.example.atmmachine.services.ATMService;
import com.example.atmmachine.utils.ApiResponse;
import org.springframework.http.HttpStatus;

public class AtmServiceImpl implements ATMService {
 private UserRepository userRepository;
    @Override
    public  ApiResponse<?> validateAtmPin(User user, ATM atm ) {
        if (!(user.getUserNumber().equals(atm.getAtmNumber()) && user.getUserPin().equals(atm.getAtmPin()))){
           return  new ApiResponse<>("01","Incorrect ATM number or pin", HttpStatus.BAD_REQUEST);
        }else {
            return new ApiResponse<>("00","Validation done",HttpStatus.ACCEPTED);
        }
    }
}
