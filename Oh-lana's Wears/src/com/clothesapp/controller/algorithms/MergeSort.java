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
 * @author Rose Khatiwada 
 * LMU ID: 23048677
 */
public class MergeSort {

    /**
     * Sorts a list of clothes by price using the Merge Sort algorithm.
     *
     * @param unsortedData the list of clothes to sort
     * @param isAsc true for ascending order, false for descending order
     * @return a sorted ArrayList of ClothesModel objects
     */
    public ArrayList<ClothesModel> sortByPrice(List<ClothesModel> unsortedData, boolean isAsc) {
        ArrayList<ClothesModel> clothesList = new ArrayList<>(unsortedData);
        mergeSort(clothesList, 0, clothesList.size() - 1, isAsc);
        return clothesList;
    }

    /**
     * Recursively splits and sorts the list using the Merge Sort algorithm.
     *
     * @param list the list to sort
     * @param left the starting index of the portion to sort
     * @param right the ending index of the portion to sort
     * @param isAsc true for ascending order, false for descending order
     */
    private void mergeSort(ArrayList<ClothesModel> list, int left, int right, boolean isAsc) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        // split and sort both halves
        mergeSort(list, left, mid, isAsc);
        mergeSort(list, mid + 1, right, isAsc);

        // Merge the sorted halves
        merge(list, left, mid, right, isAsc);
    }

    /**
     * Merges two sorted sublists into a single sorted sublist.
     *
     * @param list the list to merge
     * @param left the starting index of the first sublist
     * @param mid the ending index of the first sublist
     * @param right the ending index of the second sublist
     * @param isAsc true for ascending order, false for descending order
     */
    private void merge(ArrayList<ClothesModel> list, int left, int mid, int right, boolean isAsc) {
        ArrayList<ClothesModel> temp = new ArrayList<>();
        int i = left, j = mid + 1;

        // Merge price into temp array
        while (i <= mid && j <= right) {
            if ((isAsc && list.get(i).getPrice() <= list.get(j).getPrice())
                    || (!isAsc && list.get(i).getPrice() > list.get(j).getPrice())) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }

        // Add price from left half
        while (i <= mid) {
            temp.add(list.get(i));
            i++;
        }

        // Add price from right half
        while (j <= right) {
            temp.add(list.get(j));
            j++;
        }

        // Swap
        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
    }

}
