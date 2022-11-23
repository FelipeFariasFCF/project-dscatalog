package com.example.demo.dto;

import com.example.demo.services.validation.UserUpdateValid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
@AllArgsConstructor
@UserUpdateValid
public class UserUpdateDTO extends UserDTO {

    @Serial
    private static final long serialVersionUID = 1L;

}