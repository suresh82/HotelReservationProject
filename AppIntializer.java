package com.wipro.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Web.xml configuration thru java
public class AppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
    @Override
    protected Class <?> [] getRootConfigClasses() {
        return new Class[] {
            AppContext.class
        };
        //return null;
    }

    @Override
    protected Class <?> [] getServletConfigClasses() {
        return new Class[] {
            WebMVCConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }
}
