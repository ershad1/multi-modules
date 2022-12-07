package com.sbicloudbd.core.employeecoreinfo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeCoreInfoService {
private final EmployeeCoreInfoRepository employeeCoreInfoRepository;
    Page<EmployeeCoreInfo> getSupervisee(Long supervisorId, Pageable pageable){
        return employeeCoreInfoRepository.finadAllsupervisorId(supervisorId, pageable);
    }
}
