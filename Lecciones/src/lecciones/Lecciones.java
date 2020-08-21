/*
 * Copyright (C) 2020 OscarGonzalezADSI
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lecciones;

/**
 *
 * @author OscarGonzalezADSI
 */
public class Lecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ------------------------------------------------------------------------
        Comentarios
        ------------------------------------------------------------------------
        */
        
        
        // Esto es un comentario
        
        /* Comentario de
           varias lineas */
        
        
        /*
        ------------------------------------------------------------------------
        Java Variables
        ------------------------------------------------------------------------
        Las variables son contenedores para almacenar valores de datos.
        En Java, existen diferentes tipos de variables, por ejemplo:
        ------------------------------------------------------------------------
        String 
        ------------------------------------------------------------------------
        Almacena texto. Los valores deben estar entre comillas dobles.
        */
        String nombre = "Óscar";
        String apellido = "González";
        String correo = "oigonzalezp@gmail.com";        
        String ralla = "----------";
        String TituloStr = "Impresión por consola de algunas variables \"string\"";
        String TituloChar = "Impresión por consola de variables \"char\"";        
        String TituloInt = "Impresión por consola de variables \"int\"";
        String TituloCons = "Impresión por consola de una constante de tipo "+
                         "\nentero \"final int\"";        
        String TituloFloat = "Impresión por consola de variables \"float\"";
        String TituloBool = "Impresión por consola de variables \"boolean\"";         

        /*
        ------------------------------------------------------------------------
        int
        ------------------------------------------------------------------------
        Almacena números enteros, sin decimales, como 123 o -123
        */
        int myNum = 15;        
        int myNum2;
        int myNum3 = 30;        
        
        myNum2 = 15; 
        myNum3 = 20;  // myNum ha cambiado de valor a 20
        /*
        ------------------------------------------------------------------------
        float
        ------------------------------------------------------------------------
        Almacena números flotantes, con decimales, como 19,99 o -19,99
        */
        float myFloatNum = 5.99f;
        /*
        ------------------------------------------------------------------------
        char
        ------------------------------------------------------------------------
        Almacena caracteres individuales, como 'a' o 'B'.
        Los valores de char deben estar entre comillas simples.
        */
        char myLetter = 'D';
        char myLetter2 = 'e';
        char myLetter3 = 'd';
        char myLetter4 = 'o';
        /*
        ------------------------------------------------------------------------
        boolean
        ------------------------------------------------------------------------
        Almacena valores con dos estados: true o false
        */
        boolean myBool = true;
        boolean myBool2 = false;
        /*
        ------------------------------------------------------------------------
        Con la palabra "final" se declara la variable como una constante
        que no admite cambios posteriores.
        ------------------------------------------------------------------------
        */
        final int myNum4 = 15;
        /*
        ------------------------------------------------------------------------
        Con la función System.out.println("contenido"); se imprime por consola.
        ------------------------------------------------------------------------
        */        
        System.out.println("Hola mundo,");
        System.out.println("mi nombre es "+nombre+" "+apellido);
        System.out.println("y tengo un grupo de whatsapp para estudiar Java.");
        System.out.println("Estás invitado a ser parte de él. Es gratis.");
        System.out.println(ralla = ralla+ralla+ralla+ralla+ralla);
        System.out.println("WhatsApp: 322-8858439");
        System.out.println(ralla);
        //----------------------------------------------------------------------
        System.out.println(TituloStr);
        //----------------------------------------------------------------------
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(correo);
        System.out.println(ralla);
        //----------------------------------------------------------------------
        System.out.println(TituloChar);
        //----------------------------------------------------------------------
        System.out.println(ralla);
        System.out.println(myLetter);
        System.out.println(myLetter2);
        System.out.println(myLetter3);
        System.out.println(myLetter4);
        System.out.println(ralla);
        System.out.println(TituloInt);
        //----------------------------------------------------------------------
        System.out.println(ralla);
        System.out.println(myNum);
        System.out.println(myNum2);
        System.out.println(myNum3);
        System.out.println(ralla);
        //----------------------------------------------------------------------
        System.out.println(TituloCons);
        //----------------------------------------------------------------------
        System.out.println(ralla);
        System.out.println(myNum4);
        System.out.println(ralla);
        //----------------------------------------------------------------------
        System.out.println(TituloFloat);
        //----------------------------------------------------------------------
        System.out.println(ralla);
        System.out.println(myFloatNum);
        System.out.println(ralla);
        //----------------------------------------------------------------------
        System.out.println(TituloBool);
        //----------------------------------------------------------------------
        System.out.println(ralla);
        System.out.println(myBool);       
        System.out.println(myBool2);
        System.out.println(ralla);
        //----------------------------------------------------------------------
    }
    
}
