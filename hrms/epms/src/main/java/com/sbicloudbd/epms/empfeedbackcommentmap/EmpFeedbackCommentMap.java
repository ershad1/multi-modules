package com.sbicloudbd.epms.empfeedbackcommentmap;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "emp_feedback_comment_map")
public class EmpFeedbackCommentMap {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "version")
    private Long version;
    @Column(name = "comment", columnDefinition = "TEXT")
    private String comment;
    @Column(name = "hr_assess_feedback_comment_id")
    private Long hrAssessFeedbackCommentId;
    @Column(name = "hr_assessment_setting_id")
    private Long hrAssessmentSettingId;
    @Column(name = "employee_info_id")
    private Long employeeInfoId;

    @Column(name = "evaluator_core_info_id")
    private Long evaluatorCoreInfoId;

    @Column(name = "created_by")
    private Long createdBy;
    @Column(name = "updated_by")
    private Long updatedBy;
    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
    @Column(name = "domain_status_id")
    private Long domainStatusId;
}
