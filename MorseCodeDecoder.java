/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test_interfaces;

/**
 *
 * @author jabah
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
      String result = new String();

      for (String word : morseCode.trim().split("   ")) {
        for (String w : word.trim().split(" ")) {
          //System.out.println(w+"$"+MorseCode.get(w));
          result = result.concat(MorseCode.get(w));
        }
        result = result.concat(" ");
      }
      return result.substring(0,result.length()-1);
    }
}