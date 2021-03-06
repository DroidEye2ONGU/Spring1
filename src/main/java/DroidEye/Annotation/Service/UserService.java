package DroidEye.Annotation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import DroidEye.Annotation.Repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    /**
    * #当自动装配时 使用@Autowired和@Resource的区别
    *   ①@Autowired是Spring框架中的注解,@Resource是JavaEE中的注解
    *   ②@Resource默认按照名称方式进行bean匹配，@Autowired默认按照类型方式进行bean匹配
    *
    * #当匹配类型出现两个以上的类时,对于@Autowired的解决方法:
    *       ①使需要装配的变量名和set方法与声明时产生的名称相同
    *       ②使用@Qualifier("")指定确定的实现类.
    *       注意:@Autowired和@Qualifier注解可以放的位置:
    *           ①同时放在声明的私有变量上边
    *           ②同时放在私有变量的set方法上边
    *           ③@Autowired放在set方法上边,@Qualifier放在set方法的入参旁边(即set方法中参数类型的左边)
    *
    * #当匹配类型出现两个以上的类时,对于@Resource的解决方法:
    *       ①使用@Resource(name="")的形式,显式指定name(name即是使用@Component @Service @Controller
    *        @Repository注解声明SpringIoC容器托管类的时候默认生成的名字(首字母小写其他单词首字母大写),或
    *        是声明时使用@Component(value="***")这样的形式指定的value中的值
    *        即(其他声明注解相同)@Component(value="***") @Resource(name="***")
    * */
    @Autowired
    public void setUserRepository(@Qualifier("userRepository")UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        System.out.println("UserService add...");
        userRepository.save();
    }
}
