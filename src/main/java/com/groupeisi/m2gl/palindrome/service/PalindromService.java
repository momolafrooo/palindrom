package com.groupeisi.m2gl.palindrome.service;

import com.groupeisi.m2gl.palindrome.dto.PalindromRequestDTO;
import com.groupeisi.m2gl.palindrome.dto.PalindromResponseDTO;


public interface PalindromService {
    PalindromResponseDTO checkPalindrom(PalindromRequestDTO palindromRequestDTO);
}
