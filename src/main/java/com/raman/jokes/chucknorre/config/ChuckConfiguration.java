package com.raman.jokes.chucknorre.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** Spring will read this annotation and create bean of it in it's context */
//@Configuration - commenting to show demo for xml based bean
public class ChuckConfiguration {

    /** now it is handy to get this bean injected anywhere we need in the project */
    // @Bean - commenting to show demo for xml based bean
    public ChuckNorrisQuotes getChuckNorrisQuotesBean() {
        return new ChuckNorrisQuotes();
    }
}
