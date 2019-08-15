package study.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class Board {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String content;

    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    @Column
    private LocalDateTime regDate;

    @Column
    private LocalDateTime modDate;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
