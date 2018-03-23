package com.kuzmin.train.training.configuration;

import com.kuzmin.train.training.AppConfig;
import com.kuzmin.train.training.JpaRepositoriesConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class WebInitializerConfig extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppConfig.class);
        rootContext.register(JpaRepositoriesConfig.class);
        return rootContext;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(MvcConfiguration.class);
        dispatcherContext.register(SwaggerConfig.class);
        return dispatcherContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
