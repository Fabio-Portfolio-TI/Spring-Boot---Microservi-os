package br.com.cursomicroservicos.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuracao {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
