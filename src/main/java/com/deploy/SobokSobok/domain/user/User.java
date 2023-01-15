package com.deploy.SobokSobok.domain.user;

import com.deploy.SobokSobok.domain.common.AuditingTimeEntity;
import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends AuditingTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String email;

    @Embedded
    private SocialInfo socialInfo;

    private User(String socialId, UserSocialType socialType, String nickname, String email) {
        this.socialInfo = SocialInfo.of(socialId, socialType);
        this.nickname = nickname;
        this.email = email;
    }

    public static User newInstance(String socialId, UserSocialType socialType, String name, String email) {
        return new User(socialId, socialType, name, email);
    }
}
