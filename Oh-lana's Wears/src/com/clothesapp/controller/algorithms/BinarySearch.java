/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clothesapp.controller.algorithms;

import java.util.List;
import com.clothesapp.model.ClothesModel;
import java.util.ArrayList;

/**
 *
 * @author Rose Khatiwada
 * LMU ID: 23048677
 */
public class BinarySearch {

    /**
     * Performs a binary search to find a product by its name in a sorted list
     * of clothes.
     *
     * @param searchValue the name of the product to search for
     * @param clothesList the sorted list of clothes to search within
     * @param low the starting index of the current search range
     * @param high the ending index of the current search range
     * @return the ClothesModel object if found, or null if the product does not
     * exist
     */
    public ClothesModel searchByNameProduct(
            String searchValue,
            List<ClothesModel> clothesList,
            int low,
            int high
    ) {
        if (high < low) {
            return null;
        }
        //indexing
        int mid = (low + high) / 2;

        if (clothesList.get(mid).getProductname().toLowerCase().equals(searchValue.toLowerCase())) {
            return clothesList.get(mid);
        } else if (searchValue.compareToIgnoreCase(clothesList.get(mid).getProductname()) < 0) {
            //search value is less than mid value
            return searchByNameProduct(searchValue, clothesList, low, mid - 1);
        } else {
            return searchByNameProduct(searchValue, clothesList, mid + 1, high);
        }

    }

}
