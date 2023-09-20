    import java.util.Scanner;

public class ConditionalPractice {

    public static void main(String[] args) {
        interactiveQuiz();
    }

    public static void interactiveQuiz() {
        int temp;
        int score = 0;
        Scanner ruready = new Scanner(System.in); // Are you Ready?
        System.out.println("Are you ready for a quiz?");
        String ready = ruready.nextLine();
        if (ready == "yes" || ready == "Yes" || ready == "Y" || ready == "y") {
            System.out.println("Okay, here it comes!");
        } else {
            System.out.println("Too bad, here it comes!");
        }
        Scanner sq1 = new Scanner(System.in); // Question 1
        System.out.println("What is 1 + 1?\n1) Centrifugal force is 0.40 radians in angular velocity\n2) apple\n3) 2");
        temp = sq1.nextInt();
        if (temp == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Too bad, that's incorrect.");
        }

        Scanner sq2 = new Scanner(System.in); // Question 2
        System.out.println("What is 7+19?\n1) 2\n2) 26\n3) 14");
        temp = sq2.nextInt();
        if (temp == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Too bad, that's incorrect.");
        }
        Scanner sq3 = new Scanner(System.in); // Question 3
        System.out.println("What is 4*5?\n1) 20 \n2) 26\n3) 16");
        temp = sq3.nextInt();
        if (temp == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Too bad, that's incorrect.");
        }
        System.out.println("You got " + score + " out of 3!");
        if (score == 3) {
            System.out.println("Good Work!");
        } else if (score == 2) {
            System.out.println("Good.");
        } else {
            System.out.println("Study more next time.");

        }
    }
        
    public static void spaceBoxing(){
        double Venus = 0.78;
        double Mars = 0.39;
        double Jupiter = 2.65;
        double Saturn = 1.17;
        double Uranus = 1.05;
        double Neptune = 1.23;
        double planetnumber;
        double urweight;
        Scanner yorweight = new Scanner(System.in);
        System.out.println("Please enter your current earth weight");
        urweight = yorweight.nextDouble();
        System.out.println("I have information for the following planets");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune");
        Scanner planetnum = new Scanner(System.in);
        System.out.println("Which planet are you visiting?");
        planetnumber = planetnum.nextDouble();
        if (planetnumber == 1) {
            System.out.println("Your weight would be " + (urweight * Venus));
        }
            else if (planetnumber == 2) {
                System.out.println("Your weight would be " + (urweight * Mars));
            }
            else if (planetnumber == 3) {
                System.out.println("Your weight would be " + (urweight * Jupiter));
            }
            else if (planetnumber == 4) {
                System.out.println("Your weight would be " + (urweight * Saturn));
            }
            else if (planetnumber == 5) {
                System.out.println("Your weight would be " + (urweight * Uranus));
            }
            else if (planetnumber == 60) {
                System.out.println("Your weight would be " + (urweight * Neptune));
            }
        }






    public static void drivingage(){
        int age;
        String name;
        Scanner inputname = new Scanner(System.in);
        System.out.println("Whats your name?");
        name = inputname.next();
        Scanner inputage = new Scanner(System.in);
        System.out.println("Whats your age?");
        age = inputage.nextInt();


        if ( age < 16) {
            System.out.println("You can't Drive, " + name);
        }  else if ((age == 16) || (age == 17)) {
            System.out.println("You can drive but not vote, " + name);
        } else if ((age >= 18) && (age <= 24)) {
            System.out.println("You can vote but not rent a car, " + name);
        } else {
            System.out.println("You can do pretty much anything, " + name);
        }
    }
    public static void cars1(){
        int people = 30;
        int cars = 40;
        int buses = 15;

        //if total # of cars is more than people, there will be enough cars for everyone. If not, don't take the cars.
        // if we remove the "else" from the second function, it will automatically go to the else statement as the second statement is impossible as long as the first statement remians true.
        if ( cars > people )
        {
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people )
        {
            System.out.println( "We should not take the cars." );
        }
        else
        {
            System.out.println( "We can't decide." );
        }

        //if there are more buses than cars, it is a waste to take the buses. If there are less buses than cars, maybe everyone could save fuel and take the buses.
        if ( buses > cars )
        {
            System.out.println( "That's too many buses." );
        }
        if ( buses < cars )
        {
            System.out.println( "Maybe we could take the buses." );
        }
        else
        {
            System.out.println( "We still can't decide." );
        }

        //if there are more people than buses, more than one person could take a bus saving fuel. if not, there is no alternate option(cars) so they stay home.
        if ( people > buses )
        {
            System.out.println( "All right, let's just take the buses." );
        }
        else
        {
            System.out.println( "Fine, let's stay home then." );
        }


    }

}