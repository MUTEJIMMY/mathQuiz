//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.import java.sql.SQLOutput;

import java.util.Random;
import java.util.Scanner;

public class mathQuiz {
    public static void main(String[] args) {
        // declaration of variables
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String opInput = "";
        String reInput = "y";
        int addInputint;
        String addInput;
        int subInputint;
        String subInput;
        int mulInputint;
        String mulInput;
        double divInputint;
        String divInput;

        int randMsg;

        while((reInput.equalsIgnoreCase("y"))) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            int add = x+y;
            int sub = x-y;
            int mul = x*y;
            double div;
            randMsg = rand.nextInt(4);
            String success;
            String fail;
            // message randomizer
            if (randMsg == 0) {
                success = "Well done";
                fail = "Try again";
            } else if (randMsg == 1) {
                success = "Excellent";
                fail = "Hang in there";
            } else if(randMsg == 2) {
                success = "Good job!";
                fail = "Incorrect. Once more";
            } else {
                success = "Keep up the good work";
                fail = "Wrong. Try again";
            }

            while (!(opInput.equals("+")) && !(opInput.equals("-")) && !(opInput.equals("*")) && !(opInput.equals("/"))) { // and wants to continue


                System.out.println("What operator do you want to practice.(+,-,*,/)");
                System.out.print(":");
                opInput = scan.nextLine();

                if (opInput.equalsIgnoreCase("+")) {
                    System.out.println(add);
                    System.out.println("What is " + x + " + " + y + "?");
                    System.out.print(":");
                    // input checker using number utils
                    addInput = scan.nextLine();

                    addInputint = Integer.parseInt(addInput);

                    if (addInputint == add) {
                        System.out.println(success);
                    }
                    else {
                        System.out.println(fail);
                        while (addInputint != add) {

                            randMsg = rand.nextInt(4);
                            if (randMsg == 0) {
                                success = "Well done";
                                fail = "Try again";
                            } else if (randMsg == 1) {
                                success = "Excellent";
                                fail = "Hang in there";
                            } else if(randMsg == 2) {
                                success = "Good job!";
                                fail = "Incorrect. nce more";
                            } else {
                                success = "Keep up the good work";
                                fail = "Wrong. Try again";
                            }
                            System.out.println("If you are stuck type n to reveal answer");
                            System.out.println("What is " + x + " + " + y + "?");
                            System.out.print(":");

                            addInput = scan.nextLine();

                            if (addInput.equals("n") || addInput.equals("N")) {
                                System.out.println("The answer is " + add + ".");
                                break;
                            }

                            addInputint = Integer.parseInt(addInput);

                            if (addInputint != add) {
                                System.out.println(fail);
                            }
                            if (addInputint == add) {
                                System.out.println(success);
                            }
                        }
                    }
                } else if (opInput.equalsIgnoreCase("-")) {
                    System.out.println(sub);
                    System.out.println("What is " + x + " - " + y + "?");
                    System.out.print(":");
                    subInput = scan.nextLine();
                    subInputint = Integer.parseInt(subInput);
                    if (subInputint == sub) {
                        System.out.println(success);
                    } else {
                        while (subInputint != sub) {

                            randMsg = rand.nextInt(4);
                            if (randMsg == 0) {
                                success = "Well done";
                                fail = "Try again";
                            } else if (randMsg == 1) {
                                success = "Excellent";
                                fail = "Hang in there";
                            } else if(randMsg == 2) {
                                success = "Good job!";
                                fail = "Incorrect. Once more";
                            } else {
                                success = "Keep up the good work";
                                fail = "Wrong. Try again";
                            }

                            System.out.println("If you are stuck type n to reveal answer");
                            System.out.println("What is " + x + " - " + y + "?");
                            System.out.print(":");

                            subInput = scan.nextLine();

                            if (subInput.equals("n") || subInput.equals("N")) {
                                System.out.println("The answer is " + sub + ".");
                                break;
                            }

                            subInputint = Integer.parseInt(subInput);

                            if (subInputint != sub) {

                                System.out.println(fail);
                            }
                            if (subInputint == sub) {
                                System.out.println(success);
                            }
                        }
                    }
                } else if (opInput.equalsIgnoreCase("*")) {
                    System.out.println(mul);
                    System.out.println("What is " + x + " * " + y + "?");
                    System.out.print(":");
                    mulInput = scan.nextLine();
                    mulInputint = Integer.parseInt(mulInput);
                    if (mulInputint == mul) {
                        System.out.println(success);
                    } else {
                        while (mulInputint != mul) {

                            randMsg = rand.nextInt(4);
                            if (randMsg == 0) {
                                success = "Well done";
                                fail = "Try again";
                            } else if (randMsg == 1) {
                                success = "Excellent";
                                fail = "Hang in there";
                            } else if(randMsg == 2) {
                                success = "Good job!";
                                fail = "Incorrect. Once more";
                            } else {
                                success = "Keep up the good work";
                                fail = "Wrong. Try again";
                            }

                            System.out.println("If you are stuck type n to reveal answer");
                            System.out.println("What is " + x + " * " + y + "?");
                            System.out.print(":");


                            mulInput = scan.nextLine();


                            if (mulInput.equals("n") || mulInput.equals("N")) {
                                System.out.println("The answer is " + mul + ".");
                                break;
                            }

                            mulInputint = Integer.parseInt(mulInput);

                            if (mulInputint != mul) {

                                System.out.println(fail);
                            }
                            if (mulInputint == mul) {
                                System.out.println(success);
                            }
                        }
                    }
                } else if (opInput.equalsIgnoreCase("/")) {
                    double xDub = x;
                    double yDub = y;
                    while (y == 0) {
                        yDub = rand.nextInt(10);
                    }
                    div = xDub / yDub;

                    div *= 1000;
                    div = Math.round(div);
                    div /= 1000;
                    System.out.println(div);
                    System.out.println("What is " + x + " / " + y + "?");
                    System.out.print(":");
                    divInputint = scan.nextDouble();
                    scan.nextLine();
                    //divInputint = Integer.parseInt(divInput);


                    if (Math.abs(divInputint - div) < 0.001) {
                        System.out.println(success);
                    } else {

                        randMsg = rand.nextInt(4);
                        if (randMsg == 0) {
                            success = "Well done";
                            fail = "Try again";
                        } else if (randMsg == 1) {
                            success = "Excellent";
                            fail = "Hang in there";
                        } else if(randMsg == 2) {
                            success = "Good job!";
                            fail = "Incorrect. Once more";
                        } else {
                            success = "Keep up the good work";
                            fail = "Wrong. Try again";
                        }

                        while (divInputint != div) {
                            System.out.println(fail);
                            System.out.println("If you are stuck type n to reveal answer");
                            System.out.println("What is " + x + " / " + y + "?(Round up to three decimals)");
                            System.out.print(":");

                            divInput = scan.nextLine();

                            if (divInput.equals("n") || divInput.equals("N")) {
                                System.out.println("The answer is " + div + ".");
                                break;
                            }
                            if (divInputint != div) {

                                System.out.println(fail);
                            }
                            if (divInputint == div) {
                                System.out.println(success);
                            }
                        }
                    }
                }
                if (!(opInput.equals("+")) && !(opInput.equals("-")) && !(opInput.equals("*")) && !(opInput.equals("/"))) {
                    System.out.println("bad input please typing one of the right inputs.");
                }
            }
            System.out.println("do you want to continue(y/n)");
            System.out.print(":");
            reInput = scan.nextLine();
            while (!(reInput.equalsIgnoreCase("y")) && !(reInput.equalsIgnoreCase("n"))) {
                System.out.println("Please enter a valid input");
                System.out.print(":");
                reInput = scan.nextLine();
            }
            if(!(reInput.equalsIgnoreCase("y"))) {
                System.out.println("Thank you for using my math practice machine.");
            }
            opInput = "";

        }
        System.out.println("");
    }
}