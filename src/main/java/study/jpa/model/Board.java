package study.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import study.jpa.model.enums.BoardType;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.Z")
    private LocalDateTime regDate;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.Z")
    private LocalDateTime modDate;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
