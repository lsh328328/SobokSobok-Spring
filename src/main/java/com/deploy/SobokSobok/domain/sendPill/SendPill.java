package com.deploy.SobokSobok.domain.sendPill;

import com.deploy.SobokSobok.domain.common.AuditingTimeEntity;
import com.deploy.SobokSobok.domain.pill.Pill;
import com.deploy.SobokSobok.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SendPill extends AuditingTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToOne
    @JoinColumn(name = "pill_id")
    private Pill pill;

    @ManyToOne
    @JoinColumn(name = "send_user")
    private User sendUser;

    @ManyToOne
    @JoinColumn(name = "receive_user")
    private User receiveUser;

    @Column(nullable = false)
    private boolean isAccept;
}
