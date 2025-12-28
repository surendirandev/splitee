package com.surendiran.projects.et.model;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "GROUP_USER_ASSIGNMENT")
public class GroupUserAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UNIQUE_ID")
    private Long id;

    @Column(name = "GROUP_ID")
    private Long groupId;

    @Column(name = "USER_ID")
    private Long userId;

    public GroupUserAssignment() {
        this(null, null, null);
    }

    public GroupUserAssignment(Long id, Long groupId, Long userId) {
        setId(id);
        setGroupId(groupId);
        setUserId(userId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("groupId", getGroupId())
                .append("userId", getUserId())
                .toString();
    }
}
