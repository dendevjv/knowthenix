package io.dpopkov.knowthenix.security;

public class SecurityConstants {

    /* Time Constants */
    private static final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
    public static final long EXPIRATION_TIME = 5 * MILLIS_PER_DAY; // 5 days

    /* Authentication Constants */
    /** This custom header is used for sending generated JWT token when processing login request. */
    public static final String JWT_HEADER = "Jwt-Token";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String AUTHORITIES = "authorities";

    /* URL Constants */
    public static final String H2_CONSOLE_URL = "/h2-console/**";
    private static final String USER_PREFIX = "/user";
    public static final String[] PUBLIC_URLS = {
            USER_PREFIX + "/login",
            USER_PREFIX + "/register",
            USER_PREFIX + "/image/**",
            H2_CONSOLE_URL};
}
