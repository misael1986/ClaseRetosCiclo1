/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.claseretosciclo1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Reto2 {

    String nombreApellidos = "";
    int edad = 0, puntajeExam = 0;
    float salario = 0;
    int descuentoEdad, descuentoExam, descuentoIngFamiliar, descuentoTotal;

    Reto2() {//Construtor

        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        System.out.println("Nombre del Estuidante: ");
        nombreApellidos = letras.nextLine();

        System.out.println("Edad del Estudiante: ");
        edad = numeros.nextInt();
        System.out.println("Puntaje del Estudiante en Examen: ");
        puntajeExam = numeros.nextInt();
        System.out.println("Digite su ingreso salarian en puntos decimales de SMMLV:");
        salario = numeros.nextFloat();
        //-----------------------Edad--------------------------------
        if (edad >= 15 && edad <= 18) {
            descuentoEdad = 25;
        } else if (edad >= 19 && edad <= 21) {
            descuentoEdad = 15;
        } else if (edad >= 22 && edad <= 25) {
            descuentoEdad = 10;
        } else {
            descuentoEdad = 0;
        }

        //------------------------Ingreso----------------------------
        if (salario <= 1) {
            descuentoIngFamiliar = 30;
        } else if (salario > 1 && salario <= 2) {
            descuentoIngFamiliar = 20;
        } else if (salario > 2 && salario <= 3) {
            descuentoIngFamiliar = 10;
        } else if (salario > 3 && salario <= 4) {
            descuentoIngFamiliar = 5;
        } else {
            descuentoIngFamiliar = 0;
        }

        //--------------------------Examen-----------------------
        if (puntajeExam >= 80 && puntajeExam < 86) {
            descuentoExam = 30;
        } else if (puntajeExam >= 86 && puntajeExam < 91) {
            descuentoExam = 35;
        } else if (puntajeExam >= 91 && puntajeExam < 96) {
            descuentoExam = 40;
        } else if (puntajeExam >= 96) {
            descuentoExam = 45;
        } else {
            descuentoExam = 0;
        }

        //----------------------------------------------
        descuentoTotal = descuentoEdad + descuentoIngFamiliar + descuentoExam;

        System.out.println("Descuento por Edad: " + descuentoEdad + "%");
        System.out.println("Descuento por Examen: " + descuentoExam + "%");
        System.out.println("Descuento por Ingreso Familiar: " + descuentoIngFamiliar + "%");
        System.out.println("Descuento Total: " + descuentoTotal + "%");

    }

    int descuentoSalario(float salario) {

        if (salario <= 1) {
            descuentoIngFamiliar = 30;
        } else if (salario > 1 && salario <= 2) {
            descuentoIngFamiliar = 20;
        } else if (salario > 2 && salario <= 3) {
            descuentoIngFamiliar = 10;
        } else if (salario > 3 && salario <= 4) {
            descuentoIngFamiliar = 5;
        } else {
            descuentoIngFamiliar = 0;
        }
        return descuentoIngFamiliar;
    }

}
