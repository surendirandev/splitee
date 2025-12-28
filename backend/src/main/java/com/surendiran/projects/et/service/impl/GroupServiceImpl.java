package com.surendiran.projects.et.service.impl;

import com.surendiran.projects.et.model.Group;
import com.surendiran.projects.et.repository.GroupRepository;
import com.surendiran.projects.et.repository.UsersRepository;
import com.surendiran.projects.et.service.GroupService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    private GroupRepository groupRepository;

    private UsersRepository usersRepository;

    public GroupServiceImpl(GroupRepository groupRepository, UsersRepository usersRepository) {
        this.groupRepository = groupRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Optional<Group> getGroupById(Long id) {
        return groupRepository.findById(id);
    }
}
