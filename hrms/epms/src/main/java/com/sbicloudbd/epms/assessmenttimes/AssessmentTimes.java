package com.sbicloudbd.epms.assessmenttimes;

import com.sbicloudbd.core.employeecoreinfo.EmployeeCoreInfo;
import jakarta.persistence.*;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "assessment_times")
public class AssessmentTimes{
    @Id
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "employee_core_info_id")
    private EmployeeCoreInfo employeeCoreInfo;
    private AssessmentName assessmentName;
    @JsonIgnore
    @Column(name = "version")
    private Long version;
    @JsonIgnore
    @Column(name = "created_by")
    private Long createdBy;
    @JsonIgnore
    @Column(name = "updated_by")
    private Long updatedBy;
    @JsonIgnore
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @JsonIgnore
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
    @JsonIgnore
    @Column(name = "domain_status_id")
    private Long domainStatusId;
}
