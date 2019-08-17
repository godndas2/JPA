package study.jpa.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Getter
@Builder
public class User implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idx;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String phone;

    @Column(length = 20, nullable = false)
    private String email;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.Z")
    private LocalDateTime regDate;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.Z")
    private LocalDateTime modDate;

}