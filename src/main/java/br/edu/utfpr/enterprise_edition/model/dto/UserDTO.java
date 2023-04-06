package br.edu.utfpr.enterprise_edition.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserDTO {
    @NonNull
    private String email;

    @NonNull
    private String senha;
}
