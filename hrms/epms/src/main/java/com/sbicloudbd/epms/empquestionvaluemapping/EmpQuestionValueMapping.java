package com.sbicloudbd.epms.empquestionvaluemapping;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "emp_question_value_mapping")
public class EmpQuestionValueMapping {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "version")
    private Long version;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "domain_status_id")
    private Long domainStatusId;

    @Column(name = "employee_core_info_id")
    private Long employeeCoreInfoId;

    @Column(name = "evaluator_comments")
    private String evaluatorComments;

    @Column(name = "evaluator_core_info_id")
    private Long evaluatorCoreInfoId;

    @Column(name = "hr_assessment_question_id")
    private Long hrAssessmentQuestionId;

    @Column(name = "hr_assessment_setting_id")
    private Long hrAssessmentSettingId;

    @Column(name = "hr_assessment_value_rat_id")
    private Long hrAssessmentValueRatId;

    @Column(name = "is_confirmation")
    private Boolean isConfirmation;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    @Column(name = "other_evaluator_id")
    private Long otherEvaluatorId;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "is_feedback")
    private Boolean isFeedback;
}
