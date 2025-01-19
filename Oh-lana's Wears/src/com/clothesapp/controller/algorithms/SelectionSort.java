/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clothesapp.controller.algorithms;

import java.util.ArrayList;
import com.clothesapp.model.ClothesModel;
import java.util.List;

/**
 *
 * @author Rose Khatiwada LMU ID: 23048677
 */
public class SelectionSort {

    public ArrayList<ClothesModel> sortByName(List<ClothesModel> unsortedData, boolean isAsc) {
        ArrayList<ClothesModel> DataToSort = new ArrayList();
        DataToSort.addAll(unsortedData);

        // Selection sort algorithm
        for (int i = 0; i < DataToSort.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < DataToSort.size(); j++) {
                // If sorting in ascending order
                if (isAsc) {
                    if (DataToSort.get(j).getProductname().compareToIgnoreCase(DataToSort.get(minIndex).getProductname()) < 0) {
                        minIndex = j;
                    }
                } else {
                    // If sorting in descending order
                    if (DataToSort.get(j).getProductname().compareToIgnoreCase(DataToSort.get(minIndex).getProductname()) > 0) {
                        minIndex = j;
                    }
                }
            }
            //Swap
            ClothesModel tempClothes = DataToSort.get(i);
            DataToSort.set(i, DataToSort.get(minIndex));
            DataToSort.set(minIndex, tempClothes);
        }

        // Return the sorted list
        return DataToSort;
    }

}
