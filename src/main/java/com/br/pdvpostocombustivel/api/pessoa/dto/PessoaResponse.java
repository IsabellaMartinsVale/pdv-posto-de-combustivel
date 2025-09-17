package com.br.pdvpostocombustivel.api.pessoa.dto;

import java.time.LocalDate;

// Para respota

public record PessoaResponse(
       Long id,
       String nomeCompleto,
       String cpfCnp,
       Long numeroCtps,
       LocalDate dataNascimento

       ) {}
