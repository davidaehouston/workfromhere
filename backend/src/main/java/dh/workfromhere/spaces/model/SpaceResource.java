package dh.workfromhere.spaces.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "spaces")
public class SpaceResource {

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "spaces_seq", sequenceName = "spaces_seq", allocationSize = 1)
    @GeneratedValue(generator = "spaces_seq", strategy = GenerationType.IDENTITY)
    private Integer id;

    @Nonnull
    @Column(name = "name")
    private String name;

    @Nonnull
    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private SpaceTypeResource type;

    @Column(name = "wifi_available")
    private Boolean wifiAvailable;

    @Column(name = "wifi_password")
    private String wifiPassword;

    @Column(name = "wifi_speed")
    private Integer wifiSpeed;
}
