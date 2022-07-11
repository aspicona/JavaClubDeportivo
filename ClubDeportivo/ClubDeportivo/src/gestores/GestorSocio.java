
package gestores;

import entidades.Socio;
import java.util.ArrayList;

public class GestorSocio {
   private final ArrayList<Socio> listaSocios;

   public GestorSocio() {
       listaSocios = new ArrayList<>();
   }

   public void AgregarSocio(Socio nuevo){
       if(nuevo!=null)
       listaSocios.add(nuevo);
   }

    public ArrayList<Socio> getListaSocios() {
        return listaSocios;
    }
    
    //Suma de todas las cuotas societarias
    public float SumaCuotas(){
        float sumaCuotas=0;
        
        for (Socio s : listaSocios) {
          float cuota=0;
         
          if(s.getCantDisciplinas()==1)
              cuota+=1800;
          else
          if(s.getCantDisciplinas()==2)
              cuota+=3000;
          else
          if(s.getCantDisciplinas()==3)
              cuota+=5000;
          if (s.getAccesoPileta()==1)
              cuota+=1400;
          sumaCuotas+=cuota;                               
        }
        return sumaCuotas;
    }
    
    //Porcentaje de socios que abonan el acceso a la pileta.
    public float PorcentajePileta(){

        int cantSocios=0;        
        int cantSociosPileta=0;       
        
        for (Socio s : listaSocios) {
            cantSocios++;
            if(s.getAccesoPileta()==1)
                cantSociosPileta++;       
        }
        
        
        return (float)((cantSociosPileta/cantSocios)*100);
    }
    
    //• Todos los datos del socio que más paga.
    public Socio SocioMasPaga(){
        Socio masPaga=null;
        float cuotaCara=0;
        boolean esPrimero=true;
        for (Socio s : listaSocios) {
            
            float cuota=0;
         
            if(s.getCantDisciplinas()==1)
              cuota+=1800;
            else if(s.getCantDisciplinas()==2)
              cuota+=3000;
            else if(s.getCantDisciplinas()==3)
              cuota+=5000;
            
            if (s.getAccesoPileta()==1)
              cuota+=1400;
          
            if(esPrimero){
                masPaga=s;
                cuotaCara=cuota;
                esPrimero=false;
                break;
            }
            else if(cuota>cuotaCara)
                masPaga=s;
                cuotaCara=cuota;
        }
        return masPaga;
    }
    
}

