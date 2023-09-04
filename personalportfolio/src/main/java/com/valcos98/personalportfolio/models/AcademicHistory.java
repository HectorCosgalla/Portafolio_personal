package com.valcos98.personalportfolio.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Academic_history")
public class AcademicHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "school", nullable = false, length = 50)
    private String school;

    @Column(name = "date_started",nullable = false)
    private LocalDateTime dateStarted;

    @Column(name = "date_finished")
    private LocalDateTime dateFinished;
    
}
