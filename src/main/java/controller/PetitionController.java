package controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1")
public class PetitionController {

    @GET
    @Path("/get/petitions")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPetitions() {
        return "Hello from Quarkus REST";
    }


    @GET
    @Path("/get/petition")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPetition() {
        return "Hello from Quarkus REST";
    }


    @POST
    @Path("/new/petition")
    @Produces(MediaType.TEXT_PLAIN)
    public String savePetition() {
        return "Hello from Quarkus REST";
    }


    @POST
    @Path("/sign/petition")
    @Produces(MediaType.TEXT_PLAIN)
    public String signPetition() {
        return "Hello from Quarkus REST";
    }


    @POST
    @Path("/delete/petition")
    @Produces(MediaType.TEXT_PLAIN)
    public String deletePetition() {
        return "Hello from Quarkus REST";
    }




}
