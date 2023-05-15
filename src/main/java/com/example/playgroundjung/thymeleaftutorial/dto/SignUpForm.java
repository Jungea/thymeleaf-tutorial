package com.example.playgroundjung.thymeleaftutorial.dto;

import com.example.playgroundjung.thymeleaftutorial.domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SignUpForm {
    private String firstName;
    private String lastName;
    private boolean policyAgree;
    private Gender gender;
    private String phoneNumber1;

}
