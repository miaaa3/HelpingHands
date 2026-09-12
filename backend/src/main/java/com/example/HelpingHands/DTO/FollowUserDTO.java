package com.example.HelpingHands.DTO;

import com.example.HelpingHands.Entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

/** Minimal user card for followers/following lists (no sensitive fields). */
@Data
@AllArgsConstructor
public class FollowUserDTO {
    private Long id;
    private String name;
    private String profile;
    private String role;

    public static FollowUserDTO from(UserEntity u) {
        return new FollowUserDTO(u.getId(), u.getName(), u.getProfile(), String.valueOf(u.getRole()));
    }
}
