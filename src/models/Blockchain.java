package models;

import java.util.List;
import java.util.ArrayList;
import utils.ApplySha256;

public class Blockchain {
    private int blockDiff;
    private List<Bloco> blocoList;

    public Blockchain(int blockDiff){
        blocoList = new ArrayList<>();
        this.blockDiff = blockDiff;
    }

    public void add_bloco(Bloco bloco){
        if (verifyBlocoNonce(bloco)){
            blocoList.add(bloco);
        }
        else {
            System.out.println("----- Bloco Inválido -----" +
                    "\n-- Dificuldade do Hash: " + blockDiff + " Zeros --");
        }
    }


    private boolean verifyBlocoNonce(Bloco bloco){
        String hashBlock = ApplySha256.aplicadorSha256(bloco);
        for (int i = 0; i <= (blockDiff - 1); i++) {
            if(hashBlock.charAt(i) != 0) {
                return false;
            }
        }
        return true;
    }

}
