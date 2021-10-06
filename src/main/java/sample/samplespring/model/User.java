package sample.samplespring.model;

import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;

/**
 * 사용자 엔티티 클래스
 * @author 백지연
 */
@Entity
@Table(name="dmp_user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    @Column(nullable = false)
    private long uid;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    /*
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @Column(name = "landing_url", nullable = false, length = 255)
    private String landingUrl;

    @Column(name = "regist_user", length = 100)
    private String registUser;

    @Column(name = "regist_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registTime;

    @Column(name = "modify_user", length = 100)
    private String modifyUser;

    @Column(name = "modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyTime;


    @OneToMany(mappedBy = "dmpUser", fetch = FetchType.LAZY)
    private List<DmpUserRoleEntity> dmpRole;

    @OneToMany(mappedBy = "dmpUser", fetch = FetchType.LAZY)
    private List<DmpUserGroupEntity> dmpGroup;
     */

}
