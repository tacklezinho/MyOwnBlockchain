package models;

public class Bloco {

    public int bloco_id;
    public String previus_hash;
    public String bloco_hash;
    public String bloco_data;
    public String bloco_nonce;

    public Bloco(String bloco_data) {
        this.bloco_data = bloco_data;
        this.bloco_id = 0;
    }

}
