package com.carrefour.eva.poc.controller;

import com.carrefour.eva.poc.controller.vo.StoryVo;
import com.carrefour.eva.poc.service.StoryService;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;

/**
 * Test controller
 */
@RestController
@RequestMapping(value = "/test")
@EnableSwagger2
public class StoryController {

    private final StoryService storyService;

    public StoryController(final StoryService storyService){
        this.storyService = storyService;
    }

    @GetMapping()
    public String test() {
        return "Test OK";
    }

    @PostMapping
    public void createStory(@Valid @RequestBody final StoryVo vo) {
        storyService.saveStory(vo);
    }

}
