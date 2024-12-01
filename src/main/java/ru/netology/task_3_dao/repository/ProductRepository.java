package ru.netology.task_3_dao.repository;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final String query;

    // Конструктор для внедрения зависимостей
    public ProductRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.query = read("fetch_product.sql");
    }

    /**
     * Получает список названий продуктов по имени
     *
     * @param name имя продукта для фильтрации
     * @return список названий продуктов
     */
    public List<String> getProductNames(String name) {
        Map<String, Object> params = Collections.singletonMap("name", name);
        return jdbcTemplate.queryForList(query, params, String.class);
    }

    /**
     * Чтение SQL-скрипта из ресурсов
     *
     * @param scriptFileName имя файла SQL-скрипта
     * @return содержимое скрипта как строка
     */
    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения SQL-скрипта: " + scriptFileName, e);
        }
    }
}