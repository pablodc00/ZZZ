package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;

public final class SteEncrypt {

    private static SteEncrypt instance;

    public synchronized String encryptDos(String plaintext) throws NoSuchAlgorithmException,
            UnsupportedEncodingException {

        MessageDigest md = null;
        md = MessageDigest.getInstance("SHA"); // step 2
        md.update(plaintext.getBytes("UTF-8")); // step 3

        byte raw[] = md.digest(); // step 4
        byte[] hash = Base64.encodeBase64(raw);// step 5
        String strCodificado = new String(hash, "UTF8");
        return strCodificado; // step 6
    }

    public static synchronized SteEncrypt getInstance() // step 1
    {
        if (instance == null) {
            instance = new SteEncrypt();
        }
        return instance;
    }

}