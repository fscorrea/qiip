package com.qiip.api;

import com.qiip.api.beans.User;
import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/users")
public interface UsersResource {
  /**
   * Gets a list of all `User` entities.
   */
  @GET
  @Produces("application/json")
  List<User> getusers();

  /**
   * Creates a new instance of a `User`.
   */
  @POST
  @Consumes("application/json")
  void createUser(User data);

  /**
   * Gets the details of a single instance of a `User`.
   */
  @Path("/{userId}")
  @GET
  @Produces("application/json")
  User getUser(@PathParam("userId") String userId);

  /**
   * Updates an existing `User`.
   */
  @Path("/{userId}")
  @PUT
  @Consumes("application/json")
  void updateUser(@PathParam("userId") String userId, User data);

  /**
   * Deletes an existing `User`.
   */
  @Path("/{userId}")
  @DELETE
  void deleteUser(@PathParam("userId") String userId);
}
