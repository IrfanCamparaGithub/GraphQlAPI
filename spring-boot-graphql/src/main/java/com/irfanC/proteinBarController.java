package com.irfanC;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class proteinBarController {


    @QueryMapping
    public List<proteinBar> proteinBars(){
        return proteinBar.proteinBars;
    }
    @QueryMapping
    public proteinBar proteinBarById(@Argument int id){
        return proteinBar.proteinBarByID(id);
    }

    @SchemaMapping
    public isLowCalorie lowCalorie(proteinBar proteinBar){
        return isLowCalorie.isLowCalorieByID(proteinBar.isLowCalorieID());
    }





}
