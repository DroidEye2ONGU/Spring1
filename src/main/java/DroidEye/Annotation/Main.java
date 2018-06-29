package DroidEye.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DroidEye.Annotation.Controller.UserController;
import DroidEye.Annotation.Repository.UserRepositoryImpl;
import DroidEye.Annotation.Service.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans-annotation.xml");

       /* TestObject to = (TestObject) applicationContext.getBean("testObject");
        System.out.println(to);

        UserController userController = (UserController) applicationContext.getBean("userController");
        System.out.println(userController);


        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);

        UserRepositoryImpl userRepository = (UserRepositoryImpl) applicationContext.getBean("userRepository");
        System.out.println(userRepository);*/

        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.execute();
    }
}
