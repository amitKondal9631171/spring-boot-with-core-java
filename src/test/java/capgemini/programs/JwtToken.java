package capgemini.programs;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class JwtToken {
    private static final String CLIENT_SECRET_KEY;
    private static final String PROVIDER_SECRET_KEY;

    static{

        String secret = Base64.getEncoder().encodeToString("my-interface-key".getBytes()); // generate key and save it in user information
        System.out.println("Secret generated: " + secret);


        CLIENT_SECRET_KEY = secret;
        PROVIDER_SECRET_KEY = secret;
        System.out.println("Secret assgined to client and provider");
    }
    public static void main(String[] args) throws JsonProcessingException {

        try {
            String token = JWT.create()
                    .withSubject("ccf853f0-8a3d-11f0-a751-81007ed4ef4a") // user
                    .withAudience("e43449d0-9a18-11f0-8037-31c2aafaad8d")
                   /* .withClaim("role", "2546d1d0-149b-11f0-81b8-b1461dd709bd") // role
                    .withAudience("b4a893a0-0991-11f0-9a14-c15a32120a94") // solution*/
                    .withIssuedAt(new Date())
                    .withExpiresAt(new Date(System.currentTimeMillis() + 60000000))
                    .sign(Algorithm.HMAC256(CLIENT_SECRET_KEY));

            Algorithm algorithm = Algorithm.HMAC256(PROVIDER_SECRET_KEY);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);


            System.out.println(token);


            /*

            // Step 4: Read claims

            System.out.println("Subject: " + jwt.getSubject());
            System.out.println("Custom claim : " + jwt.getClaims().get("role"));

            */
        } catch (JWTVerificationException e) {
            System.out.println("Invalid token: " + e.getMessage());
        }
    }

    }

