package com.sbicloudbd.core.employeecoreinfo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "employee_core_info")
public class EmployeeCoreInfo {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "version")
    private Long version;

    @Column(name = "approval_status")
    private String approvalStatus;

    @Column(name = "assigned_date")
    private LocalDate assignedDate;

    @Column(name = "contract_start_date")
    private LocalDate contractStartDate;

    @Column(name = "core_program_id")
    private Long coreProgramId;

    @Column(name = "core_project_id")
    private Long coreProjectId;

    @Column(name = "country_level_id")
    private Long countryLevelId;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "cur_country_join_date")
    private LocalDate curCountryJoinDate;

    @Column(name = "cur_job_start_date")
    private LocalDate curJobStartDate;

    @Column(name = "cur_job_status_id")
    private Long curJobStatusId;

    @Column(name = "cur_office_join_date")
    private LocalDate curOfficeJoinDate;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "department_id")
    private Long departmentId;

    @Column(name = "deputation_end_date")
    private LocalDate deputationEndDate;

    @Column(name = "domain_status_id")
    private Long domainStatusId;

    @Column(name = "e_designation_id")
    private Long eDesignationId;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "emp_category_id")
    private Long empCategoryId;

    @Column(name = "employee_dob")
    private LocalDate employeeDob;

    @Column(name = "employee_level_id")
    private Long employeeLevelId;

    @Column(name = "employee_status_id")
    private Long employeeStatusId;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(name = "f_designation_id")
    private Long fDesignationId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "gender_id")
    private Long genderId;

    @Column(name = "home_country_id")
    private Long homeCountryId;

    @Column(name = "is_expatriate")
    private Boolean isExpatriate;

    @Column(name = "is_on_deputation")
    private Boolean isOnDeputation;

    @Column(name = "joining_date")
    private LocalDate joiningDate;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "nominee_form")
    private String nomineeForm;

    @Column(name = "notice_period")
    private Long noticePeriod;

    @Column(name = "office_country_id")
    private Long officeCountryId;

    @Column(name = "office_info_id")
    private Long officeInfoId;

    @Column(name = "pin_no")
    private String pinNo;

    @Column(name = "program_type_id")
    private Long programTypeId;

    @Column(name = "provision_end_date")
    private LocalDate provisionEndDate;

    @Column(name = "recruitment_country_id")
    private Long recruitmentCountryId;

    @Column(name = "ref_pin")
    private String refPin;

    @Column(name = "salutation_id")
    private Long salutationId;

    @Column(name = "supervisor_id")
    private Long supervisorId;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "working_hour")
    private Long workingHour;

    @Column(name = "sl")
    private Long sl;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "position_id")
    private String positionId;

    @Column(name = "roll_no", columnDefinition = "TEXT")
    private String rollNo;

    @Column(name = "unit_id")
    private Long unitId;

    @Column(name = "previous_emp_core_info_id")
    private String previousEmpCoreInfoId;

    @Column(name = "probation_notice_period")
    private Long probationNoticePeriod;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "national_id_no", columnDefinition = "TEXT")
    private String nationalIdNo;

    @Column(name = "currency_name")
    private String currencyName;

    @Column(name = "pay_group_id")
    private Long payGroupId;

    @Column(name = "slab_id")
    private Long slabId;

    @Column(name = "is_issued_letter")
    private Boolean isIssuedLetter;

    @Column(name = "is_attendance")
    private Boolean isAttendance;

    @Column(name = "is_increment")
    private Boolean isIncrement;

    @Column(name = "is_leave")
    private Boolean isLeave;

    @Column(name = "is_promotion")
    private Boolean isPromotion;

    @Column(name = "joining_date_as_pa")
    private LocalDate joiningDateAsPa;

    @Column(name = "smart_nid_no")
    private String smartNidNo;

    @Column(name = "email")
    private String email;

    @Column(name = "is_issued_retire_letter")
    private Boolean isIssuedRetireLetter;

    @Column(name = "religion_id")
    private Long religionId;

    @Column(name = "old_employee_name")
    private String oldEmployeeName;

    @Column(name = "old_first_name")
    private String oldFirstName;

    @Column(name = "old_supervisor_id")
    private Long oldSupervisorId;

    @Column(name = "recruit_req_no")
    private String recruitReqNo;

    @Column(name = "co_ref_pin")
    private String coRefPin;

    @Column(name = "is_receive")
    private Boolean isReceive;

    @Column(name = "working_day_in_week")
    private Long workingDayInWeek;

    @Column(name = "approval_date")
    private LocalDate approvalDate;

    @Column(name = "organogram")
    private Long organogram;

    @Column(name = "position")
    private Long position;

    @Column(name = "ref_erecruit_id")
    private String refErecruitId;

    @Column(name = "is_post_ref_completed")
    private Boolean isPostRefCompleted;

    @Column(name = "is_back_check_completed")
    private Boolean isBackCheckCompleted;

    @Column(name = "is_post_ref_required")
    private Boolean isPostRefRequired;

}
