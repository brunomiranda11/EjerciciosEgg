/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeparcial;

public class EjerciciosdeParcial {

    public static String resto(String s) {
	String resto = "";
	for(int i = 1; i< s.length();i++) {
		resto+= s.charAt(i);
            }
		return resto;
	}
    public static String intercalarCharDesde(String s, char c, int pos) {
			
	if (s.length() == 1) {		// Caso base
		return"";
	}

    if(pos==0) {
	return s.charAt(0) + c + intercalarCharDesde(resto(s),c,0);
    }else {
	return s.substring(pos) + intercalarCharDesde(s,c,pos-pos); 
    }
			
			
			
}
    
   
    public static void main(String[] args) {
        System.out.println(intercalarCharDesde("calcular",'x',0));
    }
    
}
