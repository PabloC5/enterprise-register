package br.edu.utfpr.enterprise_edition.model.domain;
import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String email;

    @NonNull
    private String senha;
}
