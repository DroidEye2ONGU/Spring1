package DroidEye.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /* 以下两步可以交给spring完成
        //创建HelloWorld对象
        HelloWorld helloWorld = new HelloWorld();
        //为属性赋值
        helloWorld.setName("atguigu");
        */
        // 1.创建Spring的IOC容器对象
        // ApplicationContext 代表IOC容器
        // ClassPathXmlApplicationContext: 是ApplicationContext 接口的实现类,该实现类从类路径下来加载配置文件
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从IOC容器中获取Bean实例
        // 利用 id 定位到IODC容器中的 bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        // 利用类型返回IOC容器中的Bean,但要求IOC容器中只能有一个该类型的Bean
        //HelloWorld helloWorld = (HelloWorld) ctx.getBean(HelloWorld.class);
        System.out.println(helloWorld);


        // 3.调用hello方法
        //helloWorld.hello();


        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
