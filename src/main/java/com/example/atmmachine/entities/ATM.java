package com.example.atmmachine.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ATM {
    private String atmNumber;
    private String atmPin;
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
}
