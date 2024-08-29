package cl.praxis.ReportesInmobiliaria.model.repository;

import cl.praxis.ReportesInmobiliaria.model.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
