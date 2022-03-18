/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

import java.time.LocalDate;
import java.util.Date;

import java.util.Map;

/**
 *
 * @author ghost
 */
public class Stocks {

    private Map<Date, Double> mounts; //it is supposed to be disorganized
    private LocalDate created;

    public LocalDate getCreated() {
        return created;
    }

    public Double price(Date date) {
        return mounts.get(date);

        /**
         * mi idea era obtener el profit de la accion entre las dos fechas
         * tomando en cuenta que las acciones empezaban desde una misma fecha
         * pero supongo que asi no era el ejercicio y me complique el problema,
         * de todos modos lo dejo como opcion viable en otro problema
         *
         */
        //Integer value =mounts.entrySet().iterator().next().getValue();
        //Integer profit =0;
        //functional operation
        //profit = mounts.entrySet().stream().map(entry -> (entry.getKey().isBefore(date))?entry.getValue():0).reduce(value, Integer::sum);
        //return profit-value;
        //normal operation
//        for (Map.Entry<LocalDate, Integer> entry : mounts.entrySet()) {
//            value+=(entry.getKey().isBefore(date))?entry.getValue():0;
//            
//        }
    }

}
