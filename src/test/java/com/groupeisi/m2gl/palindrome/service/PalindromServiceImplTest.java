package com.groupeisi.m2gl.palindrome.service;

import com.groupeisi.m2gl.palindrome.dto.PalindromRequestDTO;
import com.groupeisi.m2gl.palindrome.dto.PalindromResponseDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PalindromServiceImplTest {

    @Autowired
    private PalindromService palindromService;

    @Test
    void checkPalindromIsTrue() {
        PalindromResponseDTO palindromResponseDTO = palindromService.checkPalindrom(new PalindromRequestDTO("kayak"));
        Assertions.assertTrue(palindromResponseDTO.getIsPalindrome());
    }

    @Test
    void checkPalindromIsFalse() {
        PalindromResponseDTO palindromResponseDTO = palindromService.checkPalindrom(new PalindromRequestDTO("kayaks"));
        Assertions.assertFalse(palindromResponseDTO.getIsPalindrome());
    }
}