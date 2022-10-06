package com.cos.fluxdemo.domain.web;

import com.cos.fluxdemo.domain.Customer;
import com.cos.fluxdemo.domain.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.*;

//@WebFluxTest
@SpringBootTest
@AutoConfigureWebTestClient
public class CustomerControllerTest {

    @Autowired
    private WebTestClient webTestClient;    // 비동기 http요청

    @Autowired
    private CustomerRepository customerRepository;

//    @Test
//    public void 한건찾기_테스트() {
//        System.out.println("-----------");
//        Flux<Customer> fCustomer = customerRepository.findAll();
//        fCustomer.subscribe(c -> {
//            System.out.println(c);
//        });
//    }

    @Test
    public void 한건찾기_테스트() {
        System.out.println("-----------");
        Flux<Customer> fCustomer = customerRepository.findAll();
        fCustomer.subscribe(c -> {
            System.out.println(c);
        });
    }
}