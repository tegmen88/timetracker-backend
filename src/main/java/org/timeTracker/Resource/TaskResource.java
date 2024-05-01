package org.timeTracker.Resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import org.bson.types.ObjectId;
import org.timeTracker.models.Task;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {

    @GET
    public List<Task> listTasks() {
        return Task.listAll();
    }

    @POST
    public void addTask(Task task) {
        task.persist();
    }

    @PUT
    @Path("/{id}")
    public Task updateTask(@PathParam("id") String id, Task task) {
        task.update();
        return task;
    }

    @DELETE
    @Path("/{id}")
    public void deleteTask(@PathParam("id") String id) {
        Task.findById(new ObjectId(id)).delete();
    }
}
