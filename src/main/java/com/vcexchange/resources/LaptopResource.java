package com.vcexchange.resources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.vcexchange.entity.Laptop;
import com.vcexchange.service.ILaptopService;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.vcexchange.persistence.LaptopRepo;
import java.util.List;


@Path("/laptop")
@Produces(MediaType.APPLICATION_JSON)
public class LaptopResource {
    private static final Logger logger = LoggerFactory.getLogger(LaptopResource.class);

    private ILaptopService laptopService;


    public LaptopResource(ILaptopService laptopService) {
        this.laptopService= laptopService;
    }

    @GET
    @Timed
    public List<Laptop> getLaptops()
    {
        return laptopService.getAll();
    }

    @DELETE
    @Path("/{customerid}")
    public Response removeLaptop(@PathParam("customerid") String customerid) {
        String stat = laptopService.removeLaptop(customerid);
        if(stat.equals("succeed")){
            return Response.ok().build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }
}
