package com.raman.jokes.chucknorre.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** Spring will read this annotation and create bean of it in it's context */
@Configuration
public class ChuckConfiguration {

    /** now it is handy to get this bean injected anywhere we need in the project */
    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotesBean() {
        return new ChuckNorrisQuotes();
    }
}
