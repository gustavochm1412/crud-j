package com.exemplo.produto.service;

import com.exemplo.produto.dto.ProdutoDTO;
import com.exemplo.produto.model.Produto;
import com.exemplo.produto.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto criar(ProdutoDTO dto) {
        Produto produto = new Produto();
        BeanUtils.copyProperties(dto, produto);
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto atualizar(Long id, ProdutoDTO dto) {
        Produto produto = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
        
        BeanUtils.copyProperties(dto, produto);
        produto.setId(id);
        return repository.save(produto);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Produto não encontrado");
        }
        repository.deleteById(id);
    }
} 