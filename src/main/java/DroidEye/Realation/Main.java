package DroidEye.Realation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DroidEye.AutoWire.Address;
import DroidEye.AutoWire.Person;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans-realation.xml");

        //Address address = (Address) applicationContext.getBean("address");
        //System.out.println(address);

        //Address address = (Address) applicationContext.getBean("address2");
        //System.out.println(address);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
