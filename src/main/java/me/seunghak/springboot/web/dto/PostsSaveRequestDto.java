package me.seunghak.springboot.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.seunghak.springboot.domain.posts.Posts;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
