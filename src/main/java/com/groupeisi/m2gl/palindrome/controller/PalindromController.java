package com.groupeisi.m2gl.palindrome.controller;

import com.groupeisi.m2gl.palindrome.dto.PalindromRequestDTO;
import com.groupeisi.m2gl.palindrome.dto.PalindromResponseDTO;
import com.groupeisi.m2gl.palindrome.service.PalindromService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PalindromController {

    private final PalindromService palindromService;

    public PalindromController(PalindromService palindromService) {
        this.palindromService = palindromService;
    }


    @PostMapping("/checkpalindrome")
    public ResponseEntity<PalindromResponseDTO> checkPalindrom(@RequestBody PalindromRequestDTO palindromRequestDTO) {
        PalindromResponseDTO palindromResponseDTO = palindromService.checkPalindrom(palindromRequestDTO);

        if (palindromResponseDTO.getIsPalindrome()) {
            return ResponseEntity.status(202).body(palindromResponseDTO);
        } else {
            return ResponseEntity.status(200).body(palindromResponseDTO);
        }
    }
}
