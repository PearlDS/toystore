package applicationpackage.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import applicationpackage.data.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUserNameAndPassWord(String userName, String passWord);



}
