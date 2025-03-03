package com.example.stockmarketsimulator.modules.stock.service;

import com.example.stockmarketsimulator.modules.stock.model.Stock;

import java.util.Set;

public interface StockTrackingService {
    void trackStock(String userId, String symbol);

    void untrackStock(String userId, String symbol);

    Set<String> getUserTrackedStocks(String userId);

    Set<String> getAllTrackedStocks();

    boolean isStockUntracked(String symbol);

    Stock fetchAndStoreStock(String symbol);
}
