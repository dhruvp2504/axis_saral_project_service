package com.axis.saral.projectservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.saral.projectservice.entity.Project;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

}
