package com.sbicloudbd.core.employeecoreinfo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCoreInfoRepository extends JpaRepository<EmployeeCoreInfo, Long> {
    Page<EmployeeCoreInfo> findAllBySupervisorId(Long supervisorId, Pageable pageable);

}
