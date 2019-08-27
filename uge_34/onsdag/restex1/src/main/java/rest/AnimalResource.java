/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Animal;
import java.util.ArrayList;
import java.util.Random;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author slamr
 */
@Path("animal")
public class AnimalResource {

    
    
    public static void main(String[] args) {
    
        ArrayList<Animal> animals = new ArrayList <Animal>();  

        animals.add(new Animal("Dog",2019,"Wow"));
        animals.add(new Animal("Bird",2017,"Pip"));
        animals.add(new Animal("Cat",2014,"Miau"));
        animals.add(new Animal("Horse",2009,"Pru"));
        
        Random tal = new Random();
        int number = tal.nextInt(3);
        
    
    }
        
    private Animal animalSolo = new Animal("Horse",2009,"Pru");
    
    public AnimalResource(UriInfo context) {
        this.context = context;
    }
    
    
    @Context
    private UriInfo context;
    private static  Gson gson = new GsonBuilder().setPrettyPrinting().create();
    

    /**
     * Creates a new instance of AnimalResource
     */
    public AnimalResource() {
    }

    /**
     * Retrieves representation of an instance of rest.AnimalResource
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "Hello from my first web service";
    }

    /**
     * PUT method for updating or creating an instance of AnimalResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }



    @GET
    @Path("/random")
    @Produces(MediaType.APPLICATION_JSON)
    
    //public String getOut() {
    public String getAnimal() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        
        String animalAsJson = gson.toJson(animalSolo);
        return animalAsJson;
        
    }

    
    
}
