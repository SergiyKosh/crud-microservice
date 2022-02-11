package simpleservletframework.core.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import simpleservletframework.core.annotation.processor.component.AutowiredAnnotationProcessor;
import simpleservletframework.core.annotation.processor.component.BeanAnnotationProcessor;
import simpleservletframework.core.util.PropertyUtil;

import java.util.Set;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName(PropertyUtil.getProperty("db.driver"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //init beans
        BeanAnnotationProcessor beanAnnotationProcessor = new BeanAnnotationProcessor();
        Set<Class<?>> beans = beanAnnotationProcessor.getAllBeanClasses();
        beanAnnotationProcessor.initBeans(beans);

        //inject beans
        AutowiredAnnotationProcessor autowiredAnnotationProcessor = new AutowiredAnnotationProcessor();
        autowiredAnnotationProcessor.injectBeans();
    }
}
