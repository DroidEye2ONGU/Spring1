package DroidEye.Cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans-lifeCycle.xml");

        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);

        //关闭 IoC 容器
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
