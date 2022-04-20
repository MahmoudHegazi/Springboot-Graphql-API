package com.graphql.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.graphql.entity.Dog;
import com.graphql.graphql.repository.DogRepository;
import com.graphql.graphql.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    public DogService dogService;

    public Iterable<Dog> findAllDogs(){
        return dogService.findAllDogs();
    }

    public Dog findDogById(Long id){
        return dogService.findDogById(id);
    }
}
