package dh.workfromhere.spaces.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpaceResource {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "spaces_seq", sequenceName = "spaces_seq", allocationSize = 1)
    @GeneratedValue(generator = "spaces_seq", strategy = GenerationType.AUTO)
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
