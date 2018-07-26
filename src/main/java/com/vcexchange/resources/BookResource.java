//A Dropwizard Environment consists of all the Resources
package com.vcexchange.resources;

import com.codahale.metrics.annotation.Timed;
import com.vcexchange.entity.Book;
import com.vcexchange.persistence.BookRepo;
import com.vcexchange.service.IBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {
    private static final Logger logger = LoggerFactory.getLogger(BookResource.class);

    private IBookService bookService;

    public BookResource(IBookService bookService) {
        this.bookService = bookService;
    }

    @GET
    @Timed
    public List<Book> getBooks() {
        return bookService.getAll();
    }

    @GET
    @Path("{isbn}")
    @Timed
    //pathparam will match to isdn string var
   public Book getBook(@PathParam("isbn") String isbn) {
        return bookService.getOne(isbn);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createBook(Book book) {
        logger.info("Enters createBook() {} > {}", book.getIsbn(), book.getTitle());
    }

    @DELETE
    @Path("/{isbn}")
    public Response removeBooks(@PathParam("isbn") String isbn) {
        String stat = bookService.removeBooks(isbn);
        if(stat.equals("succeed")){
            return Response.ok().build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }
}