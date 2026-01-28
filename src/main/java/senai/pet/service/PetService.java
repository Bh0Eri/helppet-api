package senai.pet.service;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;
import senai.pet.dto.PetDTO;
import senai.pet.entity.Pet;
import senai.pet.repositories.PetRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    // Conexão com o repositorio | Connection with repository
    private final PetRepository petRepository;

    // Construtor para a conexão com o repositorio estar correto. | Constructor for connection with repository
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    public List<Pet> Show(){
        return petRepository.findAll();
    }

    public String createPet(PetDTO petDTO){
        Pet pet = new Pet(petDTO.getName(),petDTO.getRace(),petDTO.getType(),petDTO.getSize(),petDTO.getAge());
        petRepository.save(pet);
        return "Sucess created";
    }

    public String delete(long id){
        if (petRepository.existsById(id)){
            petRepository.deleteById(id);
            return "Deleted sucess";
        }else {
            return "User not found";
        }

    }

    public Pet seePet(long id){
        return petRepository.findById(id).get();
    }




}
