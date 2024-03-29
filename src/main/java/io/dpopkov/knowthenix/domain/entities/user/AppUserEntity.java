package io.dpopkov.knowthenix.domain.entities.user;

import io.dpopkov.knowthenix.domain.entities.ModifiableEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

/**
 * For Future use:
 * Represents User in the functional context of the application.
 * All entities that should have 'owner', 'creator', or 'editor'
 * must reference instances of this class.
 *
 * For purposes of authentication and authorization the {@link AuthUserEntity} should be used.
 */
@Getter
@Setter
@Entity(name = "app_user")
public class AppUserEntity extends ModifiableEntity {

    /* New fields related to AuthUserEntity */

    @Column(nullable = false, unique = true)
    private String publicId;

    @Column(nullable = false, unique = true)
    private String username;

    @NotBlank(message ="full name cannot be blank.")
    private String fullName;

    /* When user is deleted it is archived actually. */
    private boolean archived;
}
