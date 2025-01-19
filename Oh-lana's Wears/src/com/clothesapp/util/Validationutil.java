/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clothesapp.util;

import java.util.regex.Pattern;

/**
 *
 * @author Rose Khatiwada LMU ID: 23048677
 */
public class Validationutil {


    private static final Pattern PRODUCTNAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern PRODUCT_CODE_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern PRODUCT_TYPE_PATTERN = Pattern.compile("^(Shirt|Pants|Dress|Jacket|Sweater)$");
    private static final Pattern COLOR_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern PRICE_PATTERN = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
    private static final Pattern STOCK_PATTERN = Pattern.compile("^\\d{1,4}$");

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the product name contains only alphabets and spaces.
     *
     * @param productName the product name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProductName(String productName) {
        return !isNullOrEmpty(productName) && PRODUCTNAME_PATTERN.matcher(productName).matches();
    }

    /**
     * Validates if the product code is exactly 4 digits.
     *
     * @param productCode the product code to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProductCode(String productCode) {
        return !isNullOrEmpty(productCode) && PRODUCT_CODE_PATTERN.matcher(productCode).matches();
    }

    /**
     * Validates if the product type is one of the allowed options.
     *
     * @param productType the product type to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProductType(String productType) {
        return !isNullOrEmpty(productType) && PRODUCT_TYPE_PATTERN.matcher(productType).matches();
    }

    /**
     * Validates if the color contains only alphabets.
     *
     * @param color the color to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidColor(String color) {
        return !isNullOrEmpty(color) && COLOR_PATTERN.matcher(color).matches();
    }

    /**
     * Validates if the stock is a number between 0 and 1000.
     *
     * @param stock the stock quantity to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStock(String stock) {
        try {
            int stockValue = Integer.parseInt(stock);
            return stockValue >= 0 && stockValue <= 1000;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Validates if the price is a positive number with up to 2 decimal places
     * and between 0.01 and 100000.00.
     *
     * @param price the price to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPrice(String price) {
        if (!isNullOrEmpty(price) && PRICE_PATTERN.matcher(price).matches()) {
            try {
                double priceValue = Double.parseDouble(price);
                return priceValue >= 0.01 && priceValue <= 100000.00;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    /**
     * Provides an error message for the invalid field.
     *
     * @param fieldName the field name to validate
     * @return error message string
     */
    public static String getErrorMessage(String fieldName) {
        switch (fieldName.toLowerCase()) {
            case "productcode":
                return "Product code must be exactly 4 digits.";
            case "productname":
                return "Product name must contain only letters and spaces.";
            case "producttype":
                return "Product type must be one of: Shirt, Pants, Dress, Jacket, Sweater.";
            case "color":
                return "Color must contain only letters.";
            case "stock":
                return "Stock must be a number between 0 and 1000.";
            case "price":
                return "Price must be between 0.01 and 100000.00.";
            default:
                return "Invalid " + fieldName;
        }
    }

    /**
     * Extended test method to demonstrate validations.
     */
    public void testValidations() {
        System.out.println("Testing Validations:");

        // Product Name Validation
        System.out.println("Valid Product Name (Test Shirt): " + isValidProductName("Test Shirt"));
        System.out.println("Invalid Product Name (Shirt123): " + !isValidProductName("Shirt123"));

        // Product Code Validation
        System.out.println("Valid Product Code (1234): " + isValidProductCode("1234"));
        System.out.println("Valid Product Code (12A4): " + isValidProductCode("12A4"));

        // Product Type Validation
        System.out.println("Valid Product Type (Shirt): " + isValidProductType("Shirt"));
        System.out.println("Invalid Product Type (ohlanaa): " + !isValidProductType("InvalidType"));

        // Color Validation
        System.out.println("Valid Color (Blue): " + isValidColor("Blue"));
        System.out.println("Valid Color (Blue123): " + isValidColor("Blue123"));

        // Stock Validation
        System.out.println("Valid Stock (500): " + isValidStock("500"));
        System.out.println("Invalid Stock (1001): " + !isValidStock("1001"));

        // Price Validation
        System.out.println("Invalid Price (25.99): " + !isValidPrice("25.99"));
        System.out.println("Valid Price (25000.99): " + isValidPrice("25000.99"));

    }


}
