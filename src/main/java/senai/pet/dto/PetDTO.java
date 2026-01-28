package senai.pet.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import senai.pet.entity.Pet;
import senai.pet.entity.enums.size;
import senai.pet.entity.enums.type;


@Getter
@Setter
public class PetDTO {

    @NotEmpty
    private String name;

    private int age;

    private size size;

    private type type;

    @NotNull
    private String race;


    public PetDTO(Pet pet){
        this.name = pet.getName();
        this.age = pet.getAge();
        this.size = pet.getSize();
        this.type = pet.getType();
        this.race = pet.getRace();
    }
}
