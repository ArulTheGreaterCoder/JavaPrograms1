import java.util.Scanner;
class MathQuiz{
    int score = 0;
    void startQuiz(){
        System.out.println("Math quiz started.");
    }
}
class Quiz extends MathQuiz{
    void askquestions(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Q1. What is 5+3?");
        int answer1 = scn.nextInt();
        if (answer1 == 8){
            System.out.println("Correct");
            score++;
        }else{
            System.out.println("Incorrect");
        }
        System.out.println("Q2. What is 10-4?");
        int answer2 = scn.nextInt();
        if (answer2 == 6){
            System.out.println("Correct");
            score++;
        }else{
            System.out.println("Incorrect");
        }
        System.out.println("Q3. What is 6*2?");
        int answer3 = scn.nextInt();
        if (answer3 == 12){
            System.out.println("Correct");
            score++;
        }else{
            System.out.println("Incorrect");
        }}
    void result(){
        System.out.println("Score:"+score+"/3");
        }
        }
public class Mathquiz{ 
    public static void main(String args[]){ 
        Quiz mathquiz = new Quiz();
        mathquiz.startQuiz();
        mathquiz.askquestions();
        mathquiz.result();
    }
}