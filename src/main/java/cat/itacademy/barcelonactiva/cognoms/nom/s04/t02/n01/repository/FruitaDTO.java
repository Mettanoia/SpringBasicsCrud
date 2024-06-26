package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

// TODO We need an annotation to create a private no args constructor probably
// TODO I am not sure which would the default values be in the current implementation
@Data
@Entity(name = "fruita")
@NoArgsConstructor(force = true)
@AllArgsConstructor
final class FruitaDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final int id;

    private final String nom;
    private final int quantitatQuilos;

}
