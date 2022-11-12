package labo4;

import io.Console;

public class Date{
    
    public static void main(String[] args){
        int annee, mois;
        System.out.print("Annee ? ");
        annee = Console.lireInt();
        System.out.print("Mois ? ");
        mois = Console.lireInt();
       
    }
    
    
    public static boolean estBissextile(int annee){
        
        
        if(annee % 400 == 0 ||(annee % 4 == 0 && annee % 100 != 0)){
            return true ;//bissextile
        } else {
            return false; // non bissextile
        
        }
    }
   
     
    public static int joursParMois(int mois, int annee){
        /*switch(mois){
            case ('1'||'3'||'5'||'7'||'8'||'10'||'12'||):
              
            break;                  
        }*/
        if(mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12){//mois%2<==1&&mois<8||mois%2>==1&&mois>8
            return 31;
        }else if (mois==4||mois==6||mois==9||mois==11){
            return 30;
        }else if(mois==2 && estBissextile(annee) == true){
            return 29;
        }else if (mois ==2 && estBissextile(annee)== false){
            return 28;
        }
    }
  /* 
    public static int getJour(String date){
        int jour;
        int posTiret1;
        posTiret1 = date.indexOf('/');

        jour = Integer.parseInt(amj.substring(posTiret2 + 1));
        
        return jour;
    }
    
    public static int getMois(String date){
        if(mois==janvier||mois==mars||mois==mai||mois==juillet||mois==août||mois==octobre||mois==decembre){
            return 31;
        }else if (mois==février){
            return 28 if{
        return 1;
    }
    
    public static int getAnnee(String date){
        return 1;
    }*/
 }
