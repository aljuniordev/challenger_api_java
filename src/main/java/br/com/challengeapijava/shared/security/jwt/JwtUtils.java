package br.com.challengeapijava.shared.security.jwt;

import br.com.challengeapijava.shared.errors.ApiException;
import br.com.challengeapijava.shared.errors.ErrorMessages;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtils {
	private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

	@Value("${security.jwt.secret}")
	private String jwtSecret;

	@Value("${security.jwt.expirationMs}")
	private int jwtExpirationMs;

	public String generateJwtToken(String username) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(jwtSecret);
			String token = JWT.create()
					.withIssuer("auth0")
					.withSubject(username)
					.withIssuedAt(new Date())
					.withExpiresAt(new Date(new Date().getTime() + jwtExpirationMs))
					.sign(algorithm);

			return token;
		} catch (JWTCreationException ex){
			logger.error("Error generate JWT token {}", ex.getMessage());
			throw new ApiException(ErrorMessages.ERROR_LOGIN, ex.getMessage());
		}
	}

	public String getUserNameFromJwtToken(String token) {
		Algorithm algorithm = Algorithm.HMAC256(jwtSecret);
		JWTVerifier verifier = JWT.require(algorithm).withIssuer("auth0").build();
		DecodedJWT jwt = verifier.verify(token);
		return jwt.getSubject();
	}

	public boolean validateJwtToken(String token) {
		try {
			Algorithm algorithm = Algorithm.HMAC256(jwtSecret);
			JWTVerifier verifier = JWT.require(algorithm).withIssuer("auth0").build();
			DecodedJWT jwt = verifier.verify(token);
			return true;
		} catch (JWTVerificationException ex) {
			logger.error("Invalid JWT: {}", ex.getMessage());
		}
		return false;
	}
}
