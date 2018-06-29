package DroidEye.Cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:" + bean + "," + beanName);

        if ("car".equals(beanName)) {
            //...
        }
        return bean;
    }
    //两个方法分别在init方法前后调用
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("" +
                "postProcessAfterInitialization:" + o + "," + s);
        Car car = new Car();
        car.setBrand("Ford");
        return car;
    }
}
