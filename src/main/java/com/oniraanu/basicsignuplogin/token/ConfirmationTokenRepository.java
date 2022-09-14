package com.oniraanu.basicsignuplogin.token;

import com.oniraanu.basicsignuplogin.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository <ConfirmationToken, Long> {
    ConfirmationToken getConfirmationToken (String token);
}
