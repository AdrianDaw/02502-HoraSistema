/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        
        // Variables
        int h; //horas
        int m; //minutos
        int s; //segundos
        
        //Objeto gregorianscalendar
        Calendar cal = Calendar.getInstance();
        
        //Obtener valores    
        h = cal.get(Calendar.HOUR_OF_DAY);
        m = cal.get(Calendar.MINUTE);
        s = cal.get(Calendar.SECOND);
        
        //Mensaje
        System.out.printf("Hora del sistema....: %02d:%02d:%02d%n", h, m, s);
    }
    
}
