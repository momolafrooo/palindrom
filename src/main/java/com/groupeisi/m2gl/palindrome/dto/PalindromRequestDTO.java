package com.groupeisi.m2gl.palindrome.dto;

public class PalindromRequestDTO {

    private String motAverifier;

    public PalindromRequestDTO() {
    }

    public PalindromRequestDTO(String motAverifier) {
        this.motAverifier = motAverifier;
    }

    public String getMotAverifier() {
        return motAverifier;
    }

    public void setMotAverifier(String motAverifier) {
        this.motAverifier = motAverifier;
    }
}
