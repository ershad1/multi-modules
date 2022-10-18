package com.sbicloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class UserService {

    EntityManager dataSource;

    public static void main(String[] args) {
        SpringApplication.run(UserService.class, args);
    }

    public List<Employee> findByPagingCriteria(String employeeName,Pageable pageable){
        Page page = employeeDAO.findAll(new Specification<Employee>() {
            @Override
            public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(employeeName!=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("employeeName"), employeeName)));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        }, pageable);
        page.getTotalElements();        // get total elements
        page.getTotalPages();           // get total pages
        return page.getContent();       // get List of Employee
    }
}
