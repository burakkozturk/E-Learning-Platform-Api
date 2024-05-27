package mbat.master.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;

@Data
@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String password;

    @Column(name = "c1status", nullable = true)
    private Integer c1status;
    @Column(name = "c2status", nullable = true)
    private Integer c2status;
    @Column(name = "c3status", nullable = true)
    private Integer c3status;

    @Column(name = "unit_status_1", nullable = false)
    private boolean unitStatus1;
    @Column(name = "unit_status_2", nullable = false)
    private boolean unitStatus2;
    @Column(name = "unit_status_3", nullable = false)
    private boolean unitStatus3;
    @Column(name = "unit_status_4", nullable = false)
    private boolean unitStatus4;
    @Column(name = "unit_status_5", nullable = false)
    private boolean unitStatus5;
    @Column(name = "unit_status_6", nullable = false)
    private boolean unitStatus6;
    @Column(name = "unit_status_7", nullable = false)
    private boolean unitStatus7;
    @Column(name = "unit_status_8", nullable = false)
    private boolean unitStatus8;
    @Column(name = "unit_status_9", nullable = false)
    private boolean unitStatus9;
    @Column(name = "unit_status_10", nullable = false)
    private boolean unitStatus10;
    @Column(name = "unit_status_11", nullable = false)
    private boolean unitStatus11;
    @Column(name = "unit_status_12", nullable = false)
    private boolean unitStatus12;
    @Column(name = "unit_status_13", nullable = false)
    private boolean unitStatus13;

    private boolean accountNonExpired;
    private boolean isEnabled;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @JoinTable(name = "authorities", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Set<Role> authorities;

    // Getter and setter methods for the unit status fields
    public boolean getUnitStatus1() { return unitStatus1; }
    public void setUnitStatus1(boolean unitStatus1) { this.unitStatus1 = unitStatus1; }

    public boolean getUnitStatus2() { return unitStatus2; }
    public void setUnitStatus2(boolean unitStatus2) { this.unitStatus2 = unitStatus2; }

    public boolean getUnitStatus3() { return unitStatus3; }
    public void setUnitStatus3(boolean unitStatus3) { this.unitStatus3 = unitStatus3; }

    public boolean getUnitStatus4() { return unitStatus4; }
    public void setUnitStatus4(boolean unitStatus4) { this.unitStatus4 = unitStatus4; }

    public boolean getUnitStatus5() { return unitStatus5; }
    public void setUnitStatus5(boolean unitStatus5) { this.unitStatus5 = unitStatus5; }

    public boolean getUnitStatus6() { return unitStatus6; }
    public void setUnitStatus6(boolean unitStatus6) { this.unitStatus6 = unitStatus6; }

    public boolean getUnitStatus7() { return unitStatus7; }
    public void setUnitStatus7(boolean unitStatus7) { this.unitStatus7 = unitStatus7; }

    public boolean getUnitStatus8() { return unitStatus8; }
    public void setUnitStatus8(boolean unitStatus8) { this.unitStatus8 = unitStatus8; }

    public boolean getUnitStatus9() { return unitStatus9; }
    public void setUnitStatus9(boolean unitStatus9) { this.unitStatus9 = unitStatus9; }

    public boolean getUnitStatus10() { return unitStatus10; }
    public void setUnitStatus10(boolean unitStatus10) { this.unitStatus10 = unitStatus10; }

    public boolean getUnitStatus11() { return unitStatus11; }
    public void setUnitStatus11(boolean unitStatus11) { this.unitStatus11 = unitStatus11; }

    public boolean getUnitStatus12() { return unitStatus12; }
    public void setUnitStatus12(boolean unitStatus12) { this.unitStatus12 = unitStatus12; }

    public boolean getUnitStatus13() { return unitStatus13; }
    public void setUnitStatus13(boolean unitStatus13) { this.unitStatus13 = unitStatus13; }
}
