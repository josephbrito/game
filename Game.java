import java.util.Scanner;
import java.util.Random;

public class Game {
        static void welcome_to_the_game(){
                String[] avaiable_choice = {"pedra", "papel", "tesoura"};
                String pc_choose;
                String my_choose;
                Scanner objName = new Scanner(System.in);
                Scanner option = new Scanner(System.in);
                Scanner my_coice_input = new Scanner(System.in);
                String username;
                int option_selected;
                Random rand = new Random();

                System.out.println("Digite seu nome: ");
                username = objName.nextLine();
                System.out.println("Bem vindo(a) " + username + " Você quer jogar?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");

                option_selected = option.nextInt();

                if(option_selected == 2){
                        System.out.println("Tabom tchau!");
                        return;
                }

                int randomNumber = rand.nextInt((2) + 1);

                pc_choose = avaiable_choice[randomNumber];
                System.out.println("Ok, vamos jogar pedra, papel ou tesoura. Eu já fiz a minha escolha, faça a sua: ");
                my_choose = my_coice_input.nextLine();


                if(my_choose.equals("pedra") && pc_choose.equals("pedra")){
                        System.out.println("Empate!");

                }else if(my_choose.equals("pedra") && pc_choose.equals("papel")){
                        System.out.println("Você perdeu! escolhi papel");

                }else if(my_choose.equals("pedra") && pc_choose.equals("tesoura")){
                        System.out.println("Parabéns você ganhou!");

                }else if(my_choose.equals("papel") && pc_choose.equals("papel")){
                        System.out.println("Empate!");
                }else if(my_choose.equals("papel") && pc_choose.equals("pedra")){
                        System.out.println("Parabéns você ganhou!");

                }else if(my_choose.equals("papel") && pc_choose.equals("tesoura")){
                        System.out.println("Você perdeu! escolhi tesoura");

                }else if(my_choose.equals("tesoura") && pc_choose.equals("tesoura")){
                        System.out.println("Empate!");

                }else if(my_choose.equals("tesoura") && pc_choose.equals("pedra")){
                        System.out.println("Você perdeu! escolhi pedra");

                }else if(my_choose.equals("tesoura") && pc_choose.equals("papel")){
                        System.out.println("Parabéns você ganhou!");

                }else{
                        System.out.println("Erro!");

                }
        }

        public static void main(String[] args){
                welcome_to_the_game();
        }
}
