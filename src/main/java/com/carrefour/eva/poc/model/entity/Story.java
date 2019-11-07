package com.carrefour.eva.poc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Story Database Model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Story")
public class Story {

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 13)
    private Long id;

    @Column(name = "CODE", nullable = false)
    private String code;
}
