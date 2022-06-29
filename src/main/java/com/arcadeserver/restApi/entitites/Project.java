package com.arcadeserver.restApi.entitites;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Lob;

@Entity
@Table(name = "project")
@Data
public class Project {

    @Id
    Long id;
    Long userId;
    String title;

    @Lob
    @Column(columnDefinition = "text")
    String text;
}
