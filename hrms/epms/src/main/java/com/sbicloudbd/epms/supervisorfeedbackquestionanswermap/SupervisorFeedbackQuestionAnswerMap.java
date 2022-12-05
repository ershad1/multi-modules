package com.sbicloudbd.epms.supervisorfeedbackquestionanswermap;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "supervisor_feedback_question_answer_map")
public class SupervisorFeedbackQuestionAnswerMap {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "version")
    private Long version;

    @Column(name = "supervisor_feedback_question_id")
    private Long supervisorFeedbackQuestionId;

    @Column(name = "answer_provider_core_info_id")
    private Long answerProviderCoreInfoId;

    @Column(name = "answer")
    private String answer;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;
}
