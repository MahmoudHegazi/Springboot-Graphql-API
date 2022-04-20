package com.graphql.graphql.services;

import com.graphql.graphql.entity.Dog;

import java.util.List;

public interface DogService {
    Iterable<Dog> findAllDogs();
    Dog findDogById(Long id);
    Dog addDog(String name, String newModal, String breed);

}
