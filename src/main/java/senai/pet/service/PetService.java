package senai.pet.service;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import senai.pet.dto.PetDTO;
import senai.pet.entity.Pet;
import senai.pet.repositories.PetRepository;

public class PetService {

    // Conexão com o repositorio | Connection with repository
    private final PetRepository petRepository;

    // Construtor para a conexão com o repositorio estar correto. | Constructor for connection with repository
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public PetDTO createPet(PetDTO petDTO){

    PetDTO pet = new Pet(petDTO.getName(),petDTO.getAge(),petDTO.getRace()petDTO.getSize(),petDTO.getType());
    petRepository.save(pet);
        return petDTO;
    }



}
