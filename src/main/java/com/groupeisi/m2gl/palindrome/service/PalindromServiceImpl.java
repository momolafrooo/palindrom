package com.groupeisi.m2gl.palindrome.service;

import com.groupeisi.m2gl.palindrome.dto.PalindromRequestDTO;
import com.groupeisi.m2gl.palindrome.dto.PalindromResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class PalindromServiceImpl implements PalindromService {


    @Override
    public PalindromResponseDTO checkPalindrom(PalindromRequestDTO palindromRequestDTO) {
        // Remove any non-alphanumeric characters and convert to lowercase
        String cleanedWord = palindromRequestDTO.getMotAverifier().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned word is a palindrome
        int length = cleanedWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(length - i - 1)) {
                return new PalindromResponseDTO(false);
            }
        }

        return new PalindromResponseDTO(true);
    }
}
