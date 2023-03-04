package by.shelopaev.tregulovboot_2.dao;

import by.shelopaev.tregulovboot_2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);

//    List<Employee> getAllByName(String name);


}
