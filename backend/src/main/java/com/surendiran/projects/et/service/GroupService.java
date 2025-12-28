package com.surendiran.projects.et.service;

import com.surendiran.projects.et.model.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    List<Group> getAllGroups();

    Optional<Group> getGroupById(Long id);
}
