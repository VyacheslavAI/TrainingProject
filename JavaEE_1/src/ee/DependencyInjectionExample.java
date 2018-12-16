package ee;

import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import javax.inject.Named;

public class DependencyInjectionExample {

    public static void main(String[] args) {
        ContainerLifecycle lifecycle = WebBeansContext.currentInstance().getService(ContainerLifecycle.class);
        lifecycle.startApplication(null);

        BeanManager beanManager = lifecycle.getBeanManager();
        Bean<?> bean = beanManager.getBeans("mainContainer").iterator().next();

        MainContainer temp = (MainContainer) lifecycle.getBeanManager().getReference(bean, MainContainer.class,
                beanManager.createCreationalContext(bean));

        temp.runBean();

        lifecycle.stopApplication(null);
    }
}

@Named
class MainContainer {
    @Inject
    MyBean bean;

    public void runBean() {
        bean.print();
    }
}

class MyBean {
    public void print() {
        System.out.println("hello world");
    }
}