package com.sbicloudbd.core.employeecoreinfo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employeeCoreInfo")
@RequiredArgsConstructor
public class EmployeeCoreInfoController {

    private final EmployeeCoreInfoService employeeCoreInfoService;

    @GetMapping("/${supervisorId}/supervisee")
    public ResponseEntity<Page<EmployeeCoreInfo>> getAllTutorials(@PathVariable Long supervisorId, Pageable pageable) {
        Page<EmployeeCoreInfo> supervisee = employeeCoreInfoService.getSupervisee(supervisorId, pageable);


        if (supervisee.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(supervisee, HttpStatus.OK);
    }

}
