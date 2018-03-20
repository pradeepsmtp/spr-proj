package pa.spr.vanila.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pa.spr.vanila.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
