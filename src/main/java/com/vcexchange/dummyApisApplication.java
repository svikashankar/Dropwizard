//A Dropwizard Environment consists of all the Resources
package com.vcexchange;

import com.vcexchange.persistence.BookRepo;
import com.vcexchange.service.BookService;
import com.vcexchange.resources.BookResource;
import com.vcexchange.service.LaptopService;
import com.vcexchange.persistence.LaptopRepo;
import com.vcexchange.resources.LaptopResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dummyApisApplication extends Application<dummyApisConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dummyApisApplication().run(args);
    }

    @Override
    public String getName() {
        return "dummyApis";
    }

    @Override
    public void initialize(final Bootstrap<dummyApisConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dummyApisConfiguration configuration,
                    final Environment environment) {
        //Register resource
        BookResource bookResource = new BookResource(new BookService(new BookRepo()));
        LaptopResource laptopResource = new LaptopResource(new LaptopService(new LaptopRepo()));
        environment.jersey().register(bookResource);
        environment.jersey().register(laptopResource);
    }

}
