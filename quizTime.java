/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ralphaelswork;

/**
 *
 * @author ACER
 */
import java.util.Random;
import java.util.Scanner;

public class quizTime {
  public static Random random = new Random();
  public static Scanner input = new Scanner(System.in);
  public static String[][] questions = {
      { "WHAT YEAR DID COVID INFECT THE WORLD?", "A. 2020", "B. 2019", "C. 2022", "B-2019", "F" },
      { "WHEN WAS THE LAST CENSUS HELD IN NIGERIA", "A. 2020", "B. 2016", "C. 2006", "C-2006", "F" },
      { "WORLD CUP IS ORGANIZED AFTER HOW MANY YEARS?", "A. 2 YEARS", "B. 4 YEARS", "C. 10 YEARS", "B-4 YEARS", "F" },
      { "NIGERIA GOT HER INDEPENDENCE IN ?", "A. 1956", "B. 1963", "C. 1960", "C-1960", "F" },
      { "HOW OLD IS NIGERIA?", "A. 50 YEARS", "B. 63 YEARS", "C. 62 YEARS", "C-62 YEARS", "F" },
      { "THE CURRENT MINISTER OF EDUCATION IS?", "A. DR. NGIGE", "B. ADAMU ADAMU", "C. LAI MOHAMMED", "B-ADAMU ADAMU",
          "F" },
      { "WHICH OF THE FOLLOWING IS NOT A POLITICAL PARTY IN NIGERIA?", "A. PDP", "B. AAO", "C. APC", "B-AAO", "F" },
      { "IN THE COAT OF ARM, THE 'Y' SILVER BAND REPRESENTS? ", "A. RIVER NIGER AND BENUE", "B. BEAUTY", "C. STRENGHT",
          " A-RIVER NIGER AND BENUE", "F" },
      { "NIGERIANS FIRST PRIME MINISTER IS?", "A. GEN OLUSEGUN OBANSANJO", "B. ALH TAFEWA BALEWA",
          "C. GEN. YAKUBU GOWON", "B-ALH. TAFEWA BALEWA", "F" },
      { " HOW MANY LGA's ARE IN NIGERIA?", "A. 774", "B. 776", "C. 770", "A-774", "F" },
      { "WHO IS THE CURRENT 'PDP' CANDIDATE?", "A. PROF. AMINU TAMBUWAL", "B. ALH. ATIKU ABUBAKAR", "C. DR. PETER OBI",
          "B-ALH. ATIKU ABUBAKAR", "F" },
  };

  public static int getQuestionNumberIndex() {
    return random.nextInt(questions.length - 1);
  }

  public static String[] getNextQuestion() {
    int questionNumber = getQuestionNumberIndex();
    while (!questions[questionNumber][5].equals("F")) {
      questionNumber = getQuestionNumberIndex();
    }
    String[] thisQuestion = questions[questionNumber];
    questions[questionNumber][5] = "T";
    return thisQuestion;
  }

  public static String[] showQuestion() {
    String[] currentQuestion = getNextQuestion(); // Get a random question

    System.out.println(currentQuestion[0]); // The question

    // These are the options
    System.out.println(currentQuestion[1]);
    System.out.println(currentQuestion[2]);
    System.out.println(currentQuestion[3]);

    return currentQuestion;
  }

  public static void startQuestions() {
       boolean decision = true;
       String[] currentQuestion = showQuestion();
               char correctAnswer = currentQuestion[4].charAt(0);
               char selection = input.next().charAt(0);
               int score=0;
               int result=0;
           while (decision) {
             decision = (selection == 'A') ? false : (selection == 'B') ? false : (selection == 'C') ? false : true;
                
               while(decision) {
                    System.out.println("Invalid option entered");

                    System.out.println(currentQuestion[0]);

                    System.out.println(currentQuestion[1]);
                    System.out.println(currentQuestion[2]);
                    System.out.println(currentQuestion[3]);

                    selection = input.next().charAt(0);
                    decision = (selection == 'A') ? false : (selection == 'B') ? false : (selection == 'C') ? false : true;
               }
                  for( int i=o; i<=questions.length;i++){
                    
                  if(selection == correctAnswer){
                  System.out.println( "Correct Answer!");
                   score++;
                   result=score+score;
                }
                 
                 else
                    System.out.println("Incorrect Answer!");
                } 
                  
              

                System.out.println("YOUR SCORE IS  "+result+"/5");
       }
      }

  public static void main(String... strings) {
    boolean decision = true;
    int response;
    System.out.println("AMAZING QUIZ ON CURRENT AFFAIRS\n READY FOR A QUIZ??\n1.YES\n2.NO");
    response = input.nextInt();
    while (decision == true) {
      if (response == 2)
        System.out.println(" OKAY SEE YOU NEXT TIME!");

      else if (response == 1) {
        System.out.println(" LETS BEGIN!\n ENTER YOUR NICKNAME");
        String name = input.next();
        System.out.println();
        for (int i = 0; i < 5; i++) {
          startQuestions();
        }
        System.out.println("\n END OF QUIZ " + name + " SEE YOU NEXT TIME!");
      }

      else {
        System.out.println(" YOU DID NOT SELECT CORRECTLY!");
      }
      decision = false;
    }
  }
}
