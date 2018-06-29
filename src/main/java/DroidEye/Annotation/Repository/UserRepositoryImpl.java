package DroidEye.Annotation.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DroidEye.Annotation.TestObject;

@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {

    //required = false 当自动装配时没有这个对象时,指定required=false可以让值为空,默认为true,找不到时会报错
    @Autowired(required = false)
    private TestObject testObject;

    public void save() {
        System.out.println("UserRepository Sava...");
        System.out.println(testObject);
    }
}
