package com.deploy.SobokSobok.domain.sendSticker;

import com.deploy.SobokSobok.domain.common.AuditingTimeEntity;
import com.deploy.SobokSobok.domain.pillSchedule.PillSchedule;
import com.deploy.SobokSobok.domain.sticker.Sticker;
import com.deploy.SobokSobok.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SendSticker extends AuditingTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "sticker_id")
    private Sticker sticker;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private PillSchedule pillSchedule;

    @ManyToOne
    @JoinColumn(name = "send_user")
    private User sendUser;

    @ManyToOne
    @JoinColumn(name = "receive_user")
    private User receiveUser;
}
