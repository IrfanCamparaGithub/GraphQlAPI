package com.irfanC;

import java.util.Arrays;
import java.util.List;

public record isLowCalorie(Integer id, Boolean isLowCalorie) {



    public static List<isLowCalorie> isLowCalories = Arrays.asList(
            new isLowCalorie(1, Boolean.TRUE),
            new isLowCalorie(2, Boolean.TRUE),
            new isLowCalorie(3, Boolean.TRUE),
            new isLowCalorie(4, Boolean.FALSE)

    );

    public static isLowCalorie isLowCalorieByID(int id) {
        return isLowCalories.stream().filter(proteinBar -> proteinBar.id.equals(id)).findFirst().orElse(null);
    }


}
