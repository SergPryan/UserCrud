package com;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserController {

    @PersistenceContext
    private EntityManager entityManager;

    @POST
    public void create(User user){

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        return Response.ok(new User()).build();
    }
}
