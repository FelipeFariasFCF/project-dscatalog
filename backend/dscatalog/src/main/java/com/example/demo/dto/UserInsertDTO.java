package com.example.demo.dto;

import com.example.demo.services.validation.UserInsertValid;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.io.Serial;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@UserInsertValid
public class UserInsertDTO extends UserDTO {

    @Serial
    private static final long serialVersionUID = 1L;

    @NotBlank
    private String password;

}