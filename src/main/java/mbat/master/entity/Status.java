package mbat.master.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "status")
@Getter
@Builder
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int u1;
    private int u2;
    private int u3;
    private int u4;
    private int u5;
    private int u6;
    private int u7;
    private int u8;
    private int u9;
    private int u10;
    private int u11;
    private int u12;
    private int u13;


    private int c1;
    private int c2;
    private int c3;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
