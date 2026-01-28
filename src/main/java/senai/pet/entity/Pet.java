package senai.pet.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import senai.pet.entity.enums.size;
import senai.pet.entity.enums.type;


@Entity
@Table(name="Pets-Tb")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    // Coluna ID dos pets para identificação | Collum id for pets identification
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // Coluna nome dos pets | Column name for pets
    @Column(length = 30)
    private String name;

    // Coluna de idade | Pets column age
    @Column(length = 2)
    private int age;

    // Coluna tipo animal | Colunm pet type
    private type type;

    // Coluna de tamanho dos pets | Size column for pets
    private size size;

    // Raça do pet | Race of pet
    private String race;
}
