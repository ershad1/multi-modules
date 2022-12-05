package com.sbicloudbd.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity implements Serializable {
    @Column(name = "version")
    private Long version;
    @Column(name = "created_by")
    private Long createdBy;
    @Column(name = "updated_by")
    private Long updatedBy;
    @Column(name = "date_created")
    private LocalDateTime dateCreated;
    @Column(name = "domain_status_id")
    private Long domainStatusId;
}
