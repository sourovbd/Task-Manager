package com.cardinity.task.manager.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id", nullable = false)
    private long project_id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy="project")
    private List<Task> tasks;

}
