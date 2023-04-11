package br.edu.utfpr.enterprise_edition.model.domain;

import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "company")
@Data
@NoArgsConstructor(force = true)
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String cnpj;

    @ManyToOne @NonNull
    private User user;
}
