package com.bigbid.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {
    private Long productId;
    private String name;
    private String description;
    private BigDecimal basePrice;
    private String status;
    private Long adminId;
    private LocalDateTime createdAt;
}
