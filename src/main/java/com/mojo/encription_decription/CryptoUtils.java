package com.inspira.encription_decription;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.Base64;


public class CryptoUtils {
    public static void main(String args[]) throws Exception{

/*        String enc = encript();
        System.out.println("enc :" +enc);
        String dec = decript();
        System.out.println("dec :" +dec);*/
        String enc = encB64("p4parish@gmail.com");
        System.out.println("enc :" +enc);
        String dec = decB64("cDRwYXJpc2hAZ21haWwuY29t");
        System.out.println("dec :" +dec);
    }

    public static String encB64(String sample){
        // create a sample String to encode

        // print actual String

        // Encode into Base64 format
        String BasicBase64format = Base64.getEncoder().encodeToString(sample.getBytes());

        // print encoded String
//        System.out.println("Encoded String:\n" + BasicBase64format);
        return  BasicBase64format;
    }
    public static String decB64(String encoded){
        // create an encoded String to decode
        // print encoded String
//        System.out.println("Encoded String:\n"+ encoded);

        // decode into String from encoded format
        byte[] actualByte = Base64.getDecoder()
                .decode(encoded);

        String actualString = new String(actualByte);

        // print actual String
        System.out.println("@DEC ctual String:\n"+ actualString);
        return  actualString;
    }

    public static String decript()
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException,
            IllegalBlockSizeException, UnsupportedEncodingException {

        //Creating a Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");

        //Creating KeyPair generator object
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

        //Initializing the key pair generator
        keyPairGen.initialize(2048);

        //Generate the pair of keys
        KeyPair pair = keyPairGen.generateKeyPair();

        //Getting the public key from the key pair
        PublicKey publicKey = pair.getPublic();

        //Creating a Cipher object
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        //Initializing a Cipher object
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        //Add data to the cipher
        byte[] input = "parish@gmail.com".getBytes();
        cipher.update(input);

        //encrypting the data
        byte[] cipherText = cipher.doFinal();
        //System.out.println( new String(cipherText, "UTF8"));

        //Initializing the same cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());

        //Decrypting the text
        byte[] decipheredText = cipher.doFinal(cipherText);
        return new String(decipheredText);
    }
    public static String encript()
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException,
            IllegalBlockSizeException, UnsupportedEncodingException {
        //Creating a Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");

        //Creating KeyPair generator object
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

        //Initializing the key pair generator
        keyPairGen.initialize(2048);

        //Generating the pair of keys
        KeyPair pair = keyPairGen.generateKeyPair();

        //Creating a Cipher object
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        //Initializing a Cipher object
        cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());

        //Adding data to the cipher
        byte[] input = "Welcome to Tutorialspoint".getBytes();
        cipher.update(input);

        //encrypting the data
        byte[] cipherText = cipher.doFinal();
        return new String(cipherText, "UTF8");
    }


}