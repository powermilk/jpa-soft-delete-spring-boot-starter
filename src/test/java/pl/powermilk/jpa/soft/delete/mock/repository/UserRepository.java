package pl.powermilk.jpa.soft.delete.mock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.powermilk.jpa.soft.delete.mock.entity.User;
import pl.powermilk.jpa.soft.delete.repository.SoftDelete;

@SoftDelete
public interface UserRepository extends JpaRepository<User, Integer> {

}
