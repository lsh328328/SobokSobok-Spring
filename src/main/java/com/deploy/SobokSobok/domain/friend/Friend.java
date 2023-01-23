package com.deploy.SobokSobok.domain.friend;

import com.deploy.SobokSobok.domain.common.AuditingTimeEntity;
import com.deploy.SobokSobok.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Friend extends AuditingTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "send_user")
    private User sendUser;

    @ManyToOne
    @JoinColumn(name = "receive_user")
    private User receiveUser;

    @Column(nullable = false)
    private boolean isAccept;

    @Column(nullable = false, length = 10)
    private String friendName;
}
