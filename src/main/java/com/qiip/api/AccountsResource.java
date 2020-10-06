package com.qiip.api;

import com.qiip.api.beans.Account;
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
@Path("/accounts")
public interface AccountsResource {
  /**
   * Gets a list of all `account` entities.
   */
  @GET
  @Produces("application/json")
  List<Account> getaccounts();

  /**
   * Creates a new instance of a `account`.
   */
  @POST
  @Consumes("application/json")
  void createaccount(Account data);

  /**
   * Gets the details of a single instance of a `account`.
   */
  @Path("/{accountId}")
  @GET
  @Produces("application/json")
  Account getaccount(@PathParam("accountId") String accountId);

  /**
   * Updates an existing `account`.
   */
  @Path("/{accountId}")
  @PUT
  @Consumes("application/json")
  void updateaccount(@PathParam("accountId") String accountId, Account data);

  /**
   * Deletes an existing `account`.
   */
  @Path("/{accountId}")
  @DELETE
  void deleteaccount(@PathParam("accountId") String accountId);
}
