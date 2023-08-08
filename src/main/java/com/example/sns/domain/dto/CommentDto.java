package com.example.sns.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentDto {

    private Long id;
    @NotBlank
    private String content;

    @Builder
    public CommentDto(Long id, String content) {
        this.id = id;
        this.content = content;
    }

}
