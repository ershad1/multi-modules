package com.sbicloudbd.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity implements Serializable {
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
