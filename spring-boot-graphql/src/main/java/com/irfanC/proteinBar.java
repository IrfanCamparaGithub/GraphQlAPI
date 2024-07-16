package com.irfanC;

import java.util.Arrays;
import java.util.List;

public record proteinBar(Integer id,
                         String name,
                         String flavorCategory,
                         Integer calories,
                         Integer gramsProtein,
                         Integer isLowCalorieID
) {

    public static List<proteinBar> proteinBars = Arrays.asList(
            new proteinBar(1, "Fitcrunch", "Mint Chocolate", 180, 20, 1),
            new proteinBar(2, "Quest", "Oreo", 190, 20, 2),
            new proteinBar(3, "Pure Protein", "Fudge", 180, 21, 3),
            new proteinBar(4, "Gatorade", "Cookies and Cream", 360, 20, 4)


    );


    public static proteinBar proteinBarByID(int id) {
        return proteinBars.stream().filter(proteinBar -> proteinBar.id.equals(id)).findFirst().orElse(null);
    }
}


/**
 * type proteinBar{
 *     id: ID,
 *     name: String,
 *     flavorCategory: String,
 *     calories: Int,
 *     gramsProtein: Int,
 *
 * }
 */