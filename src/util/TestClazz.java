package util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class TestClazz {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String resEncrypted = null;
        
        try {
            resEncrypted = SteEncrypt.getInstance().encryptDos("123456");
            int i = 1;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
