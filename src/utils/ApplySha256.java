package utils;

import models.Bloco;

import java.security.MessageDigest;

public class ApplySha256 {

    public static String aplicadorSha256(Bloco input){
        try{

            String strInput = input.bloco_id + input.previus_hash + input.bloco_nonce + input.bloco_data;

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hash = md.digest(strInput.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append(0);
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
}
