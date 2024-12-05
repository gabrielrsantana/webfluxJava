package com.example.WebFlux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {
    /**
     * Usar Mono no retorno do endpoint oferece várias vantagens, especialmente em aplicações reativas. Aqui estão algumas delas:
     *
     * Programação Reativa: Mono faz parte do projeto Reactor, que permite a programação reativa. Isso significa que você pode lidar com fluxos de dados assíncronos de maneira mais eficiente.
     * Melhor Desempenho: Em aplicações de alta concorrência, Mono pode melhorar o desempenho ao liberar threads que estariam bloqueadas esperando por operações de I/O, como chamadas de rede ou acesso a banco de dados.
     * Escalabilidade: Aplicações reativas são mais escaláveis porque utilizam melhor os recursos do sistema. Com Mono, você pode lidar com mais solicitações simultâneas sem aumentar proporcionalmente o uso de threads.
     * Tratamento de Erros: Mono oferece uma maneira elegante de tratar erros de forma reativa, permitindo que você encadeie operações e trate exceções de maneira mais fluida.
     * Composição de Fluxos: Mono permite compor fluxos de dados de maneira declarativa, facilitando a combinação de múltiplas operações assíncronas.
     * Suporte Nativo no Spring WebFlux: Mono é totalmente suportado pelo Spring WebFlux, o que facilita a integração e o desenvolvimento de aplicações reativas com Spring Boot.
     * Essas vantagens tornam o Mono uma escolha poderosa para construir aplicações modernas e reativas
     * @return String
     */
    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Olá, Mundo!");
    }


}
