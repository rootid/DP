package org.vi.singleton;

public class TokenGeneratorClient {

    public static void main(String[] args) {

        TokenGenerator tokenGenerator = TokenGenerator.getTokenGeneratorInstance();
        System.out.println("tk hash_code=" + tokenGenerator.hashCode());
        TokenGenerator tokenGenerator1 = TokenGenerator.getTokenGeneratorInstance();
        System.out.println("tk1 hash_code=" + tokenGenerator1.hashCode());
    }


}

