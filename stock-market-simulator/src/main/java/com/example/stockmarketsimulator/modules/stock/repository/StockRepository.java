package com.example.stockmarketsimulator.modules.stock.repository;

import com.example.stockmarketsimulator.modules.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    Optional<Stock> findBySymbol(String symbol);  // Fetch stock by symbol (e.g., AAPL, TSLA)

    boolean existsBySymbol(String symbol);  // Check if a stock with this symbol exists
}
