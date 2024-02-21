/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.arsw.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author josea
 */

@Configuration
public class ConfBeans {
    @Bean
    public GrammarChecker grammarChecker() {
        return new GrammarChecker();
    }
    @Primary
    @Bean
    public SpellChecker englishSpellChecker() {
        return new EnglishSpellChecker();
    }

    // @Primary
    @Bean
    public SpellChecker spanishSpellChecker() {
        return new SpanishSpellChecker();
    }
    
}
