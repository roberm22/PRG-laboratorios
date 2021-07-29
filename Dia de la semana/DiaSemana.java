package es.upm.dit.prog.laboratorio3; 

import java.util.Scanner; 

public class DiaSemana {
    /**
     * Clase que calcula el día de la semana para una fecha dada 
     */

    private int getM (int a, int m) {

        int[] mesRegular = {0,3,3,6,1,4,6,2,5,0,3,5}; 
        int[] mesBisiesto = {0,3,4,0,2,5,0,3,6,1,4,6};
        if ((a%4 == 0) && ((a%100 != 0) || (a%400 == 0) )) 
        {
        	return mesBisiesto[m-1];
        }
        else {
            return mesRegular[m-1];
        } 
    }

    /* @param anno
     * @param mes
     * @param dia
     * @return Día de la semana */

    public String getDiaSemana (int anno, int mes, int dia) { 
        String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        
        int resultado = (((anno - 1) % 7) 
        		+ ((((anno - 1) / 4) 
        		- 3 * ((((anno - 1) / 100) + 1) / 4)) % 7) 
        		+ this.getM(anno, mes)
        		+ (dia % 7)) % 7;
        return dias[resultado];
    }
    
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el año = ");
        int anno = sc.nextInt();
        System.out.print("Introduzca el mes (1-12) = ");
        int mes = sc.nextInt();
        System.out.print ("Introduzca el día del mes = ");
        int dia = sc.nextInt();
        DiaSemana ds = new DiaSemana();
        System.out.println ("El día de la semana es: " +
                ds.getDiaSemana(anno, mes, dia));
    }
}