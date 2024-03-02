package vn.edu.iuh.fit.sbrediscachemysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.sbrediscachemysql.models.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

}
