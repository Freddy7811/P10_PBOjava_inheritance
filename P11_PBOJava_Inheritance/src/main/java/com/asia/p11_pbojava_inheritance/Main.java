/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.p11_pbojava_inheritance;

/**
 *
 * @author A-1
 */
//File Main.java
public class Main {

    public static void main(String[] args) {
// Contoh Game Tebak Angka
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();
// Contoh Game Tebak Kata
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
    }
}
