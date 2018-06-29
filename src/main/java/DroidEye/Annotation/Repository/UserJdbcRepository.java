package DroidEye.Annotation.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcRepository implements UserRepository {

    @Override
    public void save() {
        System.out.println("UserJdbcRepository save...");
    }
}
