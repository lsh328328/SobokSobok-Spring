package com.deploy.SobokSobok.domain.pillSchedule;

import com.deploy.SobokSobok.domain.common.AuditingTimeEntity;
import com.deploy.SobokSobok.domain.pill.Pill;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PillSchedule extends AuditingTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "pill_id")
    private Pill pill;

    @Column(length = 8, nullable = false)
    private String time;

    @Column(nullable = false)
    private LocalDate date;
}
