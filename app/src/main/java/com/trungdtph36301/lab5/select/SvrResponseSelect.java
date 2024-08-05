package com.trungdtph36301.lab5.select;

import com.trungdtph36301.lab5.SanPham;

public class SvrResponseSelect {//get
    private SanPham[] products;
    private String message;

    public SanPham[] getProducts() {
        return products;
    }

    public String getMessage() {
        return message;
    }
}
