package com.graphql.graphql.services;

import com.graphql.graphql.entity.Dog;
import com.graphql.graphql.exception.DogNotFoundException;
import com.graphql.graphql.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DogServiceImp implements DogService{
    @Autowired
    DogRepository dogRepository;

    public Iterable<Dog> findAllDogs(){
        return dogRepository.findAll();
    }

    public Dog findDogById(Long dogId){
        Optional<Dog> currentDog = dogRepository.findById(dogId);
        if (currentDog.isPresent()){
            return currentDog.get();
        } else {
            throw new DogNotFoundException("Sorry no Dog With Id: ", dogId);
        }
    }

    public Dog addDog(String name, String newModal, String breed){

        Dog newDog = new Dog(name, newModal, breed);
        dogRepository.save(newDog);
        return newDog;
    }

}
