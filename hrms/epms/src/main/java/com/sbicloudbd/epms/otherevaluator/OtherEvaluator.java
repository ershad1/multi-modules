package com.sbicloudbd.epms.otherevaluator;

import com.sbicloudbd.epms.employeecoreinfo.EmployeeCoreInfo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "other_evaluator")
public class OtherEvaluator {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "version")
    private Long version;
    @Column(name = "assessment_year_id")
    private Long assessmentYearId;
    @ManyToOne
    @Column(name = "employee_core_info_id")
    private EmployeeCoreInfo employeeCoreInfo;
    @Column(name = "evaluator_company")
    private String evaluatorCompany;
    @Column(name = "evaluator_eci_id")
    private Long evaluatorEciId;
    @Column(name = "evaluator_email")
    private String evaluatorEmail;
    @Column(name = "evaluator_name")
    private String evaluatorName;
    @Column(name = "evaluator_phone")
    private String evaluatorPhone;
    @Column(name = "evaluator_type")
    private Long evaluatorType;
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
    @Column(name = "other_evaluator_status")
    private String otherEvaluatorStatus;
    @Column(name = "other_evaluator_type")
    private String otherEvaluatorType;
    @Column(name = "is_feedback")
    private Boolean isFeedback;
    @Column(name = "supervisor_approval_status")
    private Long supervisorApprovalStatus;
    @Column(name = "created_by")
    private Long createdBy;
    @Column(name = "updated_by")
    private Long updatedBy;
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @Column(name = "domain_status_id")
    private Long domainStatusId;
}
