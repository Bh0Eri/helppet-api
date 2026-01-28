package senai.pet.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.pet.entity.Pet;

@Repository

public interface PetRepository extends JpaRepository<Pet, Long> {
    Pet findPetByName(String name);
}
