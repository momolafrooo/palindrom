package com.groupeisi.m2gl.palindrome.dto;

public class PalindromResponseDTO {

    private boolean isPalindrome;

    public PalindromResponseDTO() {
    }

    public PalindromResponseDTO(boolean isPalindrome) {
        this.isPalindrome = isPalindrome;
    }

    public boolean getIsPalindrome() {
        return isPalindrome;
    }

    public void setPalindrome(boolean palindrome) {
        isPalindrome = palindrome;
    }
}
