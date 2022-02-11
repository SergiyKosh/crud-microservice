package simpleservletframework.core.context;

import simpleservletframework.core.beans.BeanImplementation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Map;

public class Context<T> {
    public T getBean(String id) {
        try {
            return BeanImplementation.getBean(id);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("all")
    public Map.Entry<String, T> getBean(Class<?> type) {
        return (Map.Entry<String, T>) BeanImplementation.getBean(type);
    }
}
