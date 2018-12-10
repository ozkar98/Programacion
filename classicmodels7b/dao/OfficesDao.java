/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public interface OfficesDao {

//Recibe un objeto de tipo OfficeModel y crea 
//una nueva oficina en la base de datos.
public String createOffice(OfficesModel newOffice);
 
//Devuelve un listado de las oficinas almacenadas en
//en la tabla Offices.
public ArrayList<OfficesModel> readOffices();
    
//Recibe un ojeto de tipo Office y actualiza una oficina
public String updateOffice(OfficesModel auxOffice);
    
//Borra una officina de la tabla Offices de acuerdo al
//id recibido.
public String deleteOffice(String officeCode);

}



    
