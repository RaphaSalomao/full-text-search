package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private static final List<String> SEARCHABLE_FIELDS = List.of("name", "description");

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findAllByText(String text, List<String> fields, int limit) {
        // Se não informar nenhum campo, busca nos campos padrão
        List<String> fieldsToSearchBy = fields.isEmpty() ? SEARCHABLE_FIELDS : fields;

        log.info("Searching for '{}' in fields '{}' limit '{}'", text, fieldsToSearchBy.toArray(new String[0]), limit);

        return productRepository.searchBy(text, limit, fieldsToSearchBy.toArray(new String[0]));
    }

}
