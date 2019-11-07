package com.carrefour.eva.poc.model.repository;

import com.carrefour.eva.poc.model.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CRUD Repository interface for {@link Story}
 */
public interface StoryRepository extends JpaRepository<Story, String> {
}
