package com.ydcun.jersey;

import javax.ws.rs.ApplicationPath;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/jars")
public class TestApp extends ResourceConfig{

    public TestApp() {
        packages("com.ydcun.jersey.resource");
        //注册JSON转换器
        register(JacksonJsonProvider.class);
        register(LoggingFilter.class);
    }
}
