package com.carrefour.eva.poc.controller.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Story
 */
@JsonDeserialize(builder = StoryVo.StoryVoBuilder.class)
@Builder
@Value
@ApiModel("StoryVo")
public class StoryVo implements Serializable {

    @NotNull
    @ApiModelProperty(value = "Story ID", required = true)
    private Long storyId;

    @NotNull
    @ApiModelProperty(value = "Jira Code", required = true)
    private String code;

    /**
     * Support to Jackson deserialization.
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static final class StoryVoBuilder {
    }
}
