package org.example.sms.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {

    @NotBlank(message = "Name cannot be blank", groups = CreateGroup.class)
    @Pattern(regexp = "^(?!\\s*$).+", message = "Name cannot be blank")
    private String name;

    @NotNull(message = "Age cannot be null", groups = CreateGroup.class)
    @Min(value = 5, message = "Age cannot be less than 5")
    @Max(value = 100, message = "Age cannot be greater than 100")
    private Integer age;

    @Email(message = "Email is invalid")
    @NotBlank(message = "Email cannot be blank", groups = CreateGroup.class)
    private String email;

}