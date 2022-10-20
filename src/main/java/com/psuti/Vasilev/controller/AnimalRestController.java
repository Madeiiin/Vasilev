package com.psuti.Vasilev.controller;

import com.psuti.Vasilev.dao.AnimalRepository;
import com.psuti.Vasilev.entities.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/animals")
@RestController
public class AnimalRestController {

    private final AnimalRepository animalRepository;
    @Autowired
    public AnimalRestController(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }
    @GetMapping
    public List<Animal> getAll(){
        return animalRepository.findAll();
    }
    @GetMapping("/{id}")
    public Animal getById(@PathVariable("id") UUID id){
        return animalRepository.findById(id).get();
    }
    @PutMapping
    public Animal update(@RequestBody Animal animal){
        if(animalRepository.existsById(animal.getId())){
            return animalRepository.save(animal);
        }
        throw new EntityExistsException("Animal with id:'"+ animal.getId() +"' doesn't exists");
    }
    @PostMapping
    public Animal create(@RequestBody Animal animal){
        UUID id = animal.getId();
        if(id !=null){
            if(animalRepository.existsById(animal.getId())){
                throw new EntityExistsException("Animal already exists");
            }
        }
        return animalRepository.save(animal);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") UUID id){
        animalRepository.deleteById(id);
    }
}
