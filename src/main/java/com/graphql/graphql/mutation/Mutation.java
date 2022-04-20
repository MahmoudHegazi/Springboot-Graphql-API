package com.graphql.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.graphql.entity.Dog;
import com.graphql.graphql.repository.DogRepository;
import com.graphql.graphql.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    public DogService dogService;

    public Dog addDog(String name, String modal, String breed){
        return dogService.addDog(name, modal, breed);
    }
}
