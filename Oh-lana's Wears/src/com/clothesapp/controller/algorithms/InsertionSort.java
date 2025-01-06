/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clothesapp.controller.algorithms;

import com.clothesapp.model.ClothesModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rose Khatiwada LMU ID: 23048677
 */
public class InsertionSort {

    public ArrayList<ClothesModel> sortByCode(List<ClothesModel> unsortedData, boolean isAsc) {
        ArrayList<ClothesModel> DataToSort = new ArrayList<>(unsortedData);

        // Insertion sort algorithm
        for (int i = 1; i < DataToSort.size(); i++) {
            ClothesModel current = DataToSort.get(i);
            int j = i - 1;

            // Shift Productcode to create position for current Productcode
            while (j >= 0 && ((isAsc && current.getProductcode() < DataToSort.get(j).getProductcode())
                    || (!isAsc && current.getProductcode() > DataToSort.get(j).getProductcode()))) {
                DataToSort.set(j + 1, DataToSort.get(j));
                j--;
            }

            // Swap
            DataToSort.set(j + 1, current);
        }

        return DataToSort;
    }

}
