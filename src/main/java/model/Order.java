package model;

import java.util.Map;

public record Order(Map<String,String> order) {
}

//public record Order(String productID, String productName) {}
