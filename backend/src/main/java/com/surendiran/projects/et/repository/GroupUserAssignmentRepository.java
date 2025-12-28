package com.surendiran.projects.et.repository;

import com.surendiran.projects.et.model.GroupUserAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupUserAssignmentRepository extends JpaRepository<GroupUserAssignment, Long> {
}
