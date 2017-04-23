package tr.gov.tuik.springjboss;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * @author hasan
 *         Created at 22.04.2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Collection<Employee> findByName(@Param("name") String name);
}
