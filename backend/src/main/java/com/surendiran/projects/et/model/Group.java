package com.surendiran.projects.et.model;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;

@Entity
@Table(name = "GROUPS")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UNIQUE_ID")
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(name = "CREATED_DT")
    private LocalDateTime createdDt;

    @Column(name = "CREATED_BY")
    private String createdBy;

    public Group(Long id, String name, String description, LocalDateTime createdDt, String createdBy) {
        setId(id);
        setName(name);
        setDescription(description);
        setCreatedDt(createdDt);
        setCreatedBy(createdBy);
    }

    public Group() {
        this(null, null, null, null, null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(LocalDateTime createdDt) {
        this.createdDt = createdDt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("name", getName())
                .append("description", getDescription())
                .append("createdDt", getCreatedDt())
                .append("createdBy", getCreatedBy())
                .toString();
    }
}
