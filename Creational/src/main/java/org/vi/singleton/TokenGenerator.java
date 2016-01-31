package org.vi.singleton;

public class TokenGenerator {

    private volatile static TokenGenerator tokenGenerator = null;
    private String token;

    private TokenGenerator() {
        token = "GENERATE_RANDOM";
    }

    public static TokenGenerator getTokenGeneratorInstance() {
        if (tokenGenerator == null) {
            synchronized (TokenGenerator.class) {
                if (tokenGenerator == null) {
                    tokenGenerator = new TokenGenerator();
                }
            }
        }
        return tokenGenerator;
    }

}

