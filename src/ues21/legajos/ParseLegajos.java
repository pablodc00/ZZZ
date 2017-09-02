package ues21.legajos;

import java.util.ArrayList;
import java.util.List;

public class ParseLegajos {

    /**
     * @param args
     */
    public static void main(String[] args) {

        
        List<String> legajos = new ArrayList<String>();
        legajos.add("TECNICATURA MARTILLERO Y CORREDOR PÚBLICO..................-PDGR16206");
        legajos.add("ABOGACÍA...................................................-ABG05762");
        legajos.add("ABOGACÍA...................................................-VABG43617");
        legajos.add("TECNICATURA MARTILLERO Y CORREDOR PÚBLICO..................-PDGR15290");
        
                
        String legajoCompleto = legajos.get(0);
        legajoCompleto = legajoCompleto.replace(".", "");
        System.out.println(legajoCompleto);
        
        String[] carreraLegajo = legajoCompleto.split("-");
        String carrera = carreraLegajo[0];
        System.out.println(carrera);
        String legajo = carreraLegajo[1];
        System.out.println(legajo);
        

    }

}
