package com.graphql.graphql.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import graphql.servlet.GraphQLErrorHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DogNotFoundException extends RuntimeException implements GraphQLError {
    public Map<String, Object> extensions = new HashMap<>();
    public DogNotFoundException(String message, Long DogNotFoundId){
        super(message + DogNotFoundId);
        extensions.put("DogNotFoundId", DogNotFoundId);
    }

    /**
     * @return the location(s) within the GraphQL document at which the error occurred. Each {@link SourceLocation}
     * describes the beginning of an associated syntax element
     */
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    /**
     * @return an enum classifying this error
     */
    @Override
    public ErrorType getErrorType() {
        return null;
    }

    /**
     * @return a map of error extensions or null if there are none
     */
    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }


    /**
     * @return the location(s) within the GraphQL document at which the error occurred. Each {@link SourceLocation}
     * describes the beginning of an associated syntax element
     */

}
