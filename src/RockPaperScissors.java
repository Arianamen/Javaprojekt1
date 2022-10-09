public class RockPaperScissors {

 
    public static void game() {

   boolean game = true;     
   while(game){


    System.out.println("Hej! \nVälkommen till mitt Java spel. \nVi ska spela sten sax påse och du får chansen att börja :D");
  
      
        do{ int datorVal = Fist.datorVal();
            int spelarVal = Player.userInput();
            


            if (spelarVal == 1 ){//STEN
                if (datorVal == 1 ){//STEN
                    System.out.println("Dataspleare: valde Sten, Du valde Sten och det blev oavgjort"); 
                   
                }
                 if(datorVal == 2){//SAX
                        System.out.println("Dataspleare: valde sax, Du vann!!  :D");
                        Player.score ++;
                            
                        
                }
                 if(datorVal == 3){//PÅSE
                        System.out.println("Dataspleare: valde påse, Du valde Sten och förlorade");
                        Fist.dataScore ++;
                        
                }
            }
            if (spelarVal == 2) {// SAX
                if (datorVal == 1 ){//STEN
                        System.out.println("Dataspleare: valde Sten, Du valde Sax och förlorade");
                        Fist.dataScore ++;
                        
                }
                 if(datorVal == 2){//SAX
                        System.out.println("Dataspleare: Valde Sax, Du valde Sax och det blev Oavgjort");
                        
                }
                 if(datorVal == 3){//PÅSE
                        System.out.println("Dataspleare: Valde Påse, och du valde Sax, du Vann!! :D");
                        Player.score ++;
                        
                    
                }
            }
            if (spelarVal == 3) {//PÅSE
                if (datorVal == 1 ){//STEN
                        System.out.println("Dataspleare: valde sten, du valde påse, du vann!! :D ");
                        Player.score ++;
                        
                }
                 if(datorVal == 2){//SAX
                        System.out.println("Dataspleare: valde sax, Du Valde Påse och förlorade :(");
                        Fist.dataScore ++;
                        
                }
                 if(datorVal == 3){//PÅSE
                        System.out.println("Dataspleare: valde påse, du valde påse och det blev oavgjort");
                        
                }
        }

        
        } while(Player.score < 3 && Fist.dataScore < 3);

        String play = Player.playAgain();
        if(play.equals("Y")){
                game = true;
                System.out.println("Matchscore\nDataspelare: "+ Fist.dataScore + "  "+ "Spelare: "+ Player.score+ "\n"); 
                Player.score = 0;
                Fist.dataScore = 0;
                
        }else {
                game = false;
                System.out.println("Matchscore\nDataspelare: "+ Fist.dataScore + "  "+ "Spelare: "+ Player.score+ "\n"); 
        }
       
    

        
    }

}
}

