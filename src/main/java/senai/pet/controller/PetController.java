package senai.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senai.pet.dto.PetDTO;
import senai.pet.entity.Pet;
import senai.pet.service.PetService;

@RestController
@RequestMapping("pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> CreatePet(@RequestBody PetDTO pet){
        petService.createPet(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    public ResponseEntity<?> GetPets(){
        return ResponseEntity.ok(petService.Show());
    }

    @DeleteMapping
    public ResponseEntity<?> DeletePet(@RequestBody long id){
        petService.delete(id);
        return ResponseEntity.ok().build();
    }
}
