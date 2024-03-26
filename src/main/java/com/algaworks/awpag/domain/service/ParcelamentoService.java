package com.algaworks.awpag.domain.service;

import com.algaworks.awpag.domain.model.Parcelamento;
import com.algaworks.awpag.domain.repository.ParcelamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@AllArgsConstructor
@Service
public class ParcelamentoService {

    private final ParcelamentoRepository parcelamentoRepository;

    public Parcelamento cadastrar(Parcelamento novoParcelamento)  {
        novoParcelamento.setDataCriacao(OffsetDateTime.now());

        return parcelamentoRepository.save(novoParcelamento);
    }

}
