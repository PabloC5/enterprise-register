package br.edu.utfpr.enterprise_edition.model.dto;

import lombok.NonNull;
import lombok.Data;

@Data
public class CompanyDTO {
    @NonNull
    private String name;

    @NonNull
    private String cnpj;

    @NonNull
    private UserDTO userDTO;
}
