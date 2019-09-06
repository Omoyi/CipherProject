public class Encryption {
    public void Encrypt(String message, int Key) {
        String alphabet = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
        String alphabet2 = alphabet.toLowerCase();
        StringBuilder integer = new StringBuilder(message);
        for(int i = 0; i < integer.length(); i++){
            char letter = integer.charAt(i);
            int index = alphabet.indexOf(letter);
        }

    }
}