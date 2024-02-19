package springMVCScheduled.conponents.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
                AppConfigure.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        //return new String[]{"*.do"};
        return new String[]{"/"};
    }
}
