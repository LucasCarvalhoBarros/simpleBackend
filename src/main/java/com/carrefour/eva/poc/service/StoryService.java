package com.carrefour.eva.poc.service;

import com.carrefour.eva.poc.controller.vo.StoryVo;
import com.carrefour.eva.poc.model.entity.Story;
import com.carrefour.eva.poc.model.repository.StoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * Service for Story operations
 */
@Slf4j
@Service
public class StoryService {
    private final StoryRepository storyRepository;
    private final ModelMapper mapper;

    /**
     * Story Service (Business)
     * @param storyRepository
     */
    public StoryService(final StoryRepository storyRepository){
        this.storyRepository = storyRepository;
        this.mapper = new ModelMapper();
    }

    public void saveStory(final StoryVo story){
        storyRepository.save(mapper.map(story, Story.class));
    }
}
