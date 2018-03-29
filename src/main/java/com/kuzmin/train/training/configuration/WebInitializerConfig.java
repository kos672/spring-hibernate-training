package com.kuzmin.train.training.configuration;

import com.kuzmin.train.training.AppConfig;
import com.kuzmin.train.training.JpaRepositoriesConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class[] getRootConfigClasses() {
        return new Class[]{AppConfig.class, JpaRepositoriesConfig.class};
    }

    @Override
    protected Class[] getServletConfigClasses() {
        return new Class[]{MvcConfiguration.class, SwaggerConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
