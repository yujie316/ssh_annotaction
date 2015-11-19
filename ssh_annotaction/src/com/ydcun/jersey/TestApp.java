package com.ydcun.jersey;

import javax.ws.rs.ApplicationPath;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.message.GZipEncoder;
//import org.glassfish.jersey.message.filtering.EntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.EncodingFilter;
import org.springframework.web.filter.RequestContextFilter;

import com.ydcun.jersey.resource.TestResource;

public class TestApp extends ResourceConfig{

    public TestApp() {
//        packages("com.ydcun.jersey");
        register(TestResource.class);
		EncodingFilter.enableFor(this, GZipEncoder.class);	
        //注册JSON转换器
        register(RequestContextFilter.class);
        register(JacksonJsonProvider.class);
        register(LoggingFilter.class);
    }
}
