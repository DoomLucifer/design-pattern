package com.doom.lucifer.pattern.example;

import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58ganji.com">doom</a>
 */
public class SimpleFactoryExample {

    @Test
    public void test(){
        //1.JDK类库中工具类java.text.DateFormat
        DateFormat dateFormat = DateFormat.getDateInstance();

        //2.Java加密
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
            Cipher cipher = Cipher.getInstance("DES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }
}
