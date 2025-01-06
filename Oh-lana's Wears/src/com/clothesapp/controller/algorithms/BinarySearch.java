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
 * @author Rose Khatiwada LMU ID: 23048677
 */
public class BinarySearch {

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
