import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanA =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanB =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catA = (Cat) applicationContext.getBean("cat");
        Cat catB = (Cat) applicationContext.getBean("cat");

        System.out.println(beanA == beanB);
        System.out.println(catA == catB);
    }
}