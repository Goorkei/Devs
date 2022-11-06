package Kodlama.io.Devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "ProgrammingLanguage")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "Language")
    private String language;
}
