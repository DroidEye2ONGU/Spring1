package DroidEye.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext atx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("-----------------------------------------------------------");

        Person person = (Person) atx.getBean("person5");
        System.out.println(person);

        System.out.println("-----------------------------------------------------------");

        NewPerson newPerson = (NewPerson) atx.getBean("newPerson");
        System.out.println(newPerson);

        System.out.println("-----------------------------------------------------------");

        DataSources dataSources = atx.getBean(DataSources.class);
        System.out.println(dataSources);


    }
}
