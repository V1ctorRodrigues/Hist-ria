import java.util.Scanner;
    class Livro_interativo {
       public static void main(String[] args) throws Exception {
           System.out.println("Oi,você pode fazer parte do livro interativo,\n"+
           "me ajudando a construir uma historia.\n"+
           "\nVamos lá?  - sim  - nao\n");
           Scanner start = new Scanner(System.in);
           String init = start.nextLine();
           if(init.equalsIgnoreCase("sim")){
               Package livro_interativo;
           } else if(init.equalsIgnoreCase("nao")){
               System.out.println("\nBeleza,fica para uma proxima historia\n");
               System.exit(0);
           }
   
           Scanner response = new Scanner(System.in);
               System.out.println("\n Vamos começar a construir a historia.\n");
               System.out.println("\n\n"+
               "      O que você vai fazer? (Digite sua escolha)\n\n"+
               "-1   -2  * começou\n");
               String choises = response.nextLine();
               /* Primeira parte das escolhas*/
               if(choises.equalsIgnoreCase("começou")){
              System.out.println("\nVocê é um jogador de futebol ,\n"+
              "\n e está em um jogo muito importante,\n"+
              "\n você é o melhor jogador do time,\n"+
              "\n o jogo esta 0x0 e já etá no segundo tempo e tem uma boa oportunidade ,\n"+
              "\n o que você vai fazer?\n");
   
               } else if(choises.equalsIgnoreCase("1")){
              System.out.println("\nVocê recebeu a bola e tem a opção de tocar,mais tambem pode continuar em direção ao gol");
               System.out.println("\n\n"+
               "      O que você vai fazer? (Digite sua escolha)\n\n"+
                " *tocar  -Porque você tocou?\n");
               // Respostas para parte 2
                String choises2 = response.nextLine();
              if(choises2.equalsIgnoreCase("Porque você tocou?")){
                  System.out.println("\nPorque o outro jogador estava em condiçôes melhores\n"+
                  "\n\n\n\nContinua\n");
              }else if(choises2.equalsIgnoreCase("continuar com a bola")){
                  System.out.println("\nVocê continua com a bola e dribla dois ,\n"+
                 " \n corta por meio da área,chuta no canto do goleiro\n"+
                  "\n e faz o gol do titulo\n\nFIM\n");
              }
   
               }else if(choises.equalsIgnoreCase("2")){
              System.out.println("\nVocê recebeu a bola ,partiu em velocidade ,\n"+
              "\ndriblou 2 jogadores e o goleiro fez um penalti em você,");
                System.out.println("\n\n"+
               "      O que você vai fazer? (Digite sua escolha)\n\n"+
               "-Vou bater o penalti\n");
               String choises3 = response.nextLine();
               if(choises3.equalsIgnoreCase("Vou bater o penalti")){
              System.out.println("\nVocê pega a bola,posiciona bem na marca,pega distância ,se prepara ,,\n"+
              "\ncorre para a bola e chuta no canto esquerdo do goleiro ,,\n"+
              "\nconsegue marcar o gol,abre o placar ,,\n"+
              "\nmais falta 15 minutos e pode acontecer mais coisas..\n"+
              "\n\nCONTINUA");
           }
           }
           }
       }