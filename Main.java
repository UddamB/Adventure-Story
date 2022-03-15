    package com.company;
    /*AdventureStory.java
    *May 4, 2021
    *ICS3U1 Uddam Bhathal
     THE story of an ambitious warrior who's legacy lives on today - program is based on user's decisions and outcomes - each decision leads to another */

    import java.util.Scanner; //importing Scanner to use for user input
    public class Main {
        static void myMethod() { //creating my method to use throughout story
            try //this will execute all the code inside the braces
            {
                Thread.sleep(4000); //this will delay program output by 4000 milliseconds
            }
            catch(InterruptedException ex) //if an error occurs, instead of displaying it, it will display the following:
                                           //the InterruptedException ex allows for the thread to stop then and there
            {
                Thread.currentThread().interrupt(); //The Thread.interrupt() exits out of the thread.sleep() and returns to the normal output speed
                                                    //Thread.currentThread() allows you to exit out of the thread faster
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("V                        I                       K                         I                        N                          G                      S\n\n");
            System.out.println("Welcome to your first adventure as a warrior in the viking era!");myMethod(); // the myMethod() is executing the myMethod created above
            System.out.println("Today your journey begins in land of Kattegat, a large kingdom ruled by King Echbert.");myMethod();
            System.out.println("This game is based on your personal decisions and choices.");myMethod();
            System.out.println("Take risks but don't be blinded by your confidence.");myMethod();
            System.out.println("Oh how they will talk of your story in the years to come... Make it worth every second!");myMethod();
            System.out.println("When you are ready to enter the viking realm, press 1 to begin your legacy.");myMethod();
            int start = in.nextInt(); //creating a variable to store the user input
            if (start==1){ //checking if the user input is the integer 1
                System.out.println("Before you start your adventure. Don't forget to thank your creator for these endless adventures :)");myMethod();
                System.out.println("And now the journey begins....");myMethod();
                System.out.println("Fast asleep, you wake up from a loud noise that sounds like a horn.");myMethod();
                System.out.println("Suddenly, you become aware of your senses and see what looks like twenty large ships heading your direction.");myMethod();
                System.out.println("Running in fear, you grab your battleaxe and run to the village.");myMethod();
                System.out.println("Farmers aren't the best fighters, they say...");myMethod();
                System.out.println("\"Ragnar Lothbrok!\" your wife calls, terrified with fear.");myMethod();
                System.out.println("By this time, foreign vikings have already crossed the shores, thirsty for blood.");myMethod();
                System.out.println("As your family follows you, two horses appear in the distance, where one looks injured but well enough to ride.");myMethod();
                System.out.println("Quick, a former viking is approaching near, you have 10 seconds to react.");myMethod();
                System.out.println("Will you risk riding an injured horse to safety or will the axe be in your favour...");myMethod();
                System.out.println("Press 1 to ride away with your wife and children, or Press 2 to fight back as one should.");
            }
            else { //if the first input is not the integer 1, then it will execute the following:
                System.out.println("Maybe you are not ready yet.. Valhalla needs you! Come join the fight, and prove your worth.");
            }
            myMethod();
            int rideAway = in.nextInt(); //creating the next variable to store the user input
                if (rideAway==1) { //checking if the user input is the integer 1
                    System.out.println("Riding away is a bold move for a warrior, let's hope your luck does not run out.");myMethod();
                    System.out.println("As you swiftly hop on the horse, your wife has trouble climbing the beast.");myMethod();
                    System.out.println("You help her and both of you, including the child, escape within seconds.");myMethod();
                    System.out.println("Thank the lord, Odin, for finding these horses in time.");myMethod();
                    System.out.println("Exiting your village, the horse that your wife is on begins to slow down.");myMethod();
                    System.out.println("You must take your chances and decide if you will help your family escape or leave them behind.");myMethod();
                    System.out.println("Press 1 to be more open-minded or Press 2 if you think there's no hope for them.;(");
                }
                else if(rideAway==2) { //if the user input is not the integer 1, then it will execute the following:
                    System.out.println("Tik tok, you draw your trusty axe and get ready to fight 'till the end. ");myMethod();
                    System.out.println("Luckily, your opponent underestimates you and you see an opening.");myMethod();
                    System.out.println("Farms raise fighters! You axe his bottom torso, wounding him badly.");myMethod();
                    System.out.println("He backs off in deep pain, but doesn't give up!");myMethod();
                    System.out.println("Lunging towards you, he tries to punch you but you dodge the short attack.");myMethod();
                    System.out.println("Out of no where, his axe comes towards your arm, but you cannot react fast enough as he hits your blind spot.");myMethod();
                    System.out.println("Mmmmm the pain is severe, you yell in agony, your wife and children watch with no hope.");myMethod();
                    System.out.println("You yell at them to run away, but they won't listen. They tell you that they can't live without you.");myMethod();
                    System.out.println("But you cannot give up so easily, this courage comes from them and you stand back up.");myMethod();
                    System.out.println("With pride, you throw your axe with your left hand at full speed, something impossible to doge.");myMethod();
                    System.out.println("Killing your foe, you collapse with blood all over your hands and body.");myMethod();
                    System.out.println("your family grieves for you to get back up, but you ease in and relax.");myMethod();
                    System.out.println("Your eyes slowly start shutting down while you feel sleepy.");myMethod();
                    System.out.println("ZZZZZZZZ");myMethod();
                    System.out.println("ZZZZZ");myMethod();
                    System.out.println("ZZZ");myMethod();
                    System.out.println("Z");myMethod();
                    System.out.println("...");myMethod();
                    System.out.println("Maybe fighting was not the right option.");myMethod();
                    System.out.println("Valhalla awaits you, where you shall meet with the gods and talk of your pity.");myMethod();
                    System.out.println("Your family will greet you there, carrying the burden of not running away.");myMethod();
                    System.out.println("You have not manifested your true legacy, try again and this time, don't be overconfident. ");myMethod();
                    System.out.println("Farmers are warriors, just not always victorious. Stay naive.\n");myMethod();
                    System.out.println("__     __\n" +                      //ascii art of a proud viking/farmer
                            "         / < ___ > \\\n" +
                            "         '-._____.-'\n" +
                            "          ,| ^_^ |,\n" +
                            "           ((())))\n" +
                            "             | |\n" +
                            "        ,############\\\n" +
                            "       /  #########,  \\\n" +
                            "      /_<'#########'./_\\\n" +
                            "     '_7_ ######### _o_7\n" +
                            "      (  \\[o-o-o-o]/  )\n" +
                            "       \\|l#########l|/                 __,'\n" +
                            "          ####_####                 ,-'  ,'\n" +
                            "         /    |    \\             .-'  ;  |_\n" +
                            "~~~~~~~~~|    |    |~~~~~~~~~~~~/_,-./  -._\n" +
                            "         |_  _|_  _|       ~~ ~   '--.____.\n" +
                            "  ~ ~    |\\\\//|\\\\//|             ~ ~~  ~\n" +
                            "         \\//\\\\|//\\\\/   ~ ~~~~\n" +
                            "       ___\\\\// \\\\//___\n" +
                            "      (((___X\\ /X___))) \n");
                    System.out.println("T    H    E     E     N     D");myMethod();
                }
                    int openMinded = in.nextInt(); //creating the next variable to store the user input
                    if (openMinded == 1) { //checking if the user input is the integer 1
                        System.out.println("Getting off the horse, you help her and continue moving away from the village.");myMethod();
                        System.out.println("What a miracle to be alive with family.");myMethod();
                        System.out.println("You and your family have been through life and death, but you must keep moving forward.");myMethod();
                        System.out.println("Walking for miles, you finally find a freshwater stream and begin bathing with no regrets.");myMethod();
                        System.out.println("While everyone is enjoying the water, you notice a lovely boat!");myMethod();
                        System.out.println("You call your family and think of the countless adventures it unravels.");myMethod();
                        System.out.println("Finding new lands to raid is a once in a lifetime opportunity to make a dream come true!");myMethod();
                        System.out.println("Will you go explore by boat, or venture off into the wilderness?");myMethod();
                        System.out.println("Press 1 to take the boat as a true viking, or Press 2 to travel by foot.");myMethod();
                    }
                    else if(openMinded == 2) { //if the user input is not the integer 1, then it will execute the following:
                        System.out.println("Leaving your family behind is never wise and is considered very selfish!");myMethod();
                        System.out.println("However, ignoring all emotions, you leave your wife and child behind as sacrificial pawns to your escape.");myMethod();
                        System.out.println("Not knowing the consequences, you slowly start regretting your past decisions.");myMethod();
                        System.out.println("Contemplating life, you decide to turn back around...");myMethod();
                        System.out.println("After all, family is worth more than anything as many believe.");myMethod();
                        System.out.println("Riding as fast as you can, you go back to the site where everything went downhill.");myMethod();
                        System.out.println("Sadly, there is nobody to be seen except the teared down horse lying on the floor.");myMethod();
                        System.out.println("Suddenly, you hear loud screams and a familiar voice crying, \"NO NO NO\"");myMethod();
                        System.out.println("You follow the tragic screams and eventually you find the body of your two dear souls.");myMethod();
                        System.out.println("You collapse in tears, covered with blood.");myMethod();
                        System.out.println("Everywhere you look, you see innocents dying in fear, losing their lives for reasons they don't understand.");myMethod();
                        System.out.println("Two vikings gaze your presence and start walking in your direction.");myMethod();
                        System.out.println("At this point you believe that all hope is lost and that there's no other way out of this mess.");myMethod();
                        System.out.println("If only you had a thing for family...");myMethod();
                        System.out.println("Now they're really close but you are still in shock!");myMethod();
                        System.out.println("Ultimately, you accept your fate but die in the worst way possible.");myMethod();
                        System.out.println("They carve your head and put it as a banner after the raid is complete.");myMethod();
                        System.out.println("Now that's a way to end!");myMethod();
                        System.out.println("No. Your life was meant to be more than that. Next time put family first.");myMethod();
                        System.out.println("May we meet again, in Valhalla :)\n");myMethod();
                        System.out.println("|\\__ /|        \n" +                  //ascii art of the two symbolic horses
                                "            |   ( |\\\\\\      \n" +
                                "            /        `\\\\\\\\       \n" +
                                "           (  (e        `\\\\\\\\\\\n" +
                                "           |      |         ``\\\\\\\\....________......__,;;;,\n" +
                                "          _ |     |\\             ```                   `.;;;\n" +
                                " ___..--^/( |    |  \\                                   `.;;\n" +
                                "' o    9  ;;| O  |   \\                                   |;;\n" +
                                "`-____      `__//     \\                                  |;'\n" +
                                "      ``-.'   ;;;,..__|     `                   '        |'\n" +
                                "          \\    '';;;  |           '              \\      /;\n" +
                                "           \\      '    |         |             _.'\\    (;\n" +
                                "            \\          |  |'\\|  |..______...--' \\  |\\   \\\n" +
                                "             |   ,     |  |  |  |   |;           | | \\  |\n" +
                                "             /  /..___.|  |--|  |  /;'           / |  | )\n" +
                                "            / /.'       | |  |  |\\ \\             | /  / |\n" +
                                "           / /'         ( )  | |  ||             | |  | /\n" +
                                "          ( |           | |  ( )  ||\\            | |  | |\n" +
                                "        .'.\\ \\          | |  | |  ||(           /__(  | |\n" +
                                "       / /  \\ `._       | |  | | /_(                 /__(\n" +
                                "      /_(    `._/      /  |  | |                         \n" +
                                "                      /__(  /  |                        \n" +
                                "                           /__(  )\n");
                        System.out.println("T    H    E     E     N     D");myMethod();
                        }
                        int boat = in.nextInt(); //creating the next variable to store the user input
                        if (boat == 1) { //checking if the user input is the integer 1
                            System.out.println("Now that's the spirit!");myMethod();
                            System.out.println("The next morning a new journey lies ahead.");myMethod();
                            System.out.println("You push the viking ship ahead of you and see where life takes you and your beloved.");myMethod();
                            System.out.println("Stronger than ever, you paddle your way across the stream, in search of any sorts of settlement.");myMethod();
                            System.out.println("Eventually, you reach a large village named Kattegat.");myMethod();
                            System.out.println("You become aspired to someday rule this land and prove your life's worth.");myMethod();
                            System.out.println("Your child has grown older and looks at you in satisfaction.");myMethod();
                            System.out.println("You tell him that one day we will rule this land for all its glory.");myMethod();
                            System.out.println("More amused than ever, your wife laughs at you with disbelief.");myMethod();
                            System.out.println("Ignoring her, you and the family venture into the village and meet King Echbert.");myMethod();
                            System.out.println("He asks, \"Where have you come from and how did you get here?\"");myMethod();
                            System.out.println("From which you reply, we were abandoned from our homes from a viking invasion.");myMethod();
                            System.out.println("He invites you into his kingdom and soon gets to know you more and more..");myMethod();
                            System.out.println("One day, he asks you if you shall join him in invading other lands.");myMethod();
                            System.out.println("Will you join his adventures or continue manipulating your way to power.");myMethod();
                            System.out.println("Press 2 to join his invasions or Press 1 to continue working your way to power.");
                        }
                        else if (boat == 2) { //if the user input is not the integer 1, then it will execute the following:
                            System.out.println("Taking the classical approach here. Let's see if it was worth missing the boat.");myMethod();
                            System.out.println("You get out of the water with your family. You contemplate your future on how you will find another settlement.");myMethod();
                            System.out.println("Night falls and you decide to walk during the cool weather, thinking more ground will be covered.");myMethod();
                            System.out.println("Your family follows you into the night where it becomes very foggy due to the high humidity in the air.");myMethod();
                            System.out.println("You and your family hold hands to navigate through the thick fog.");myMethod();
                            System.out.println("At this point it becomes nearly impossible to see anything in front or behind you.");myMethod();
                            System.out.println("Walking through the fog, your wife's hand suddenly gets separated. ");myMethod();
                            System.out.println("Scared to death, you yell her name and call for her.");myMethod();
                            System.out.println("No response is heard. Now you try going back.");myMethod();
                            System.out.println("Regardless of which direction you go, you are clearly lost in the fog and have no idea where anything is anymore.");myMethod();
                            System.out.println("Sadly, this fog doesn't end for weeks.");myMethod();
                            System.out.println("Ultimately, you are now forever alone, stranded in the middle of nowhere with nowhere to go.");myMethod();
                            System.out.println("Without any food or water for weeks, you become depressed and malnourished.");myMethod();
                            System.out.println("Day by day, you feel apart of yourself die in hunger.");myMethod();
                            System.out.println("In the end, walking forever did not lead you or your family anywhere, except to their graves.");myMethod();
                            System.out.println("Next time, take risks and accept the opportunities that come your way.");myMethod();
                            System.out.println("At least you tried... Nice try though.\n");myMethod();
                            System.out.println("\n" +
                                    "                                        ___    ,'\"\"\"\"'.\n" +               //ascii art of an angry cloud showering the world with fog
                                    "                                    ,\"\"\"   \"\"\"\"'      `.\n" +
                                    "                                   ,'        _.         `._\n" +
                                    "                                  ,'       ,'              `\"\"\"'.\n" +
                                    "                                 ,'    .-\"\"`.    ,-'            `.\n" +
                                    "                                ,'    (        ,'                :\n" +
                                    "                              ,'     ,'           __,            `.\n" +
                                    "                        ,\"\"\"\"'     .' ;-.    ,  ,'  \\             `\"\"\"\".\n" +
                                    "                      ,'           `-(   `._(_,'     )_                `.\n" +
                                    "                     ,'         ,---. \\ @ ;   \\ @ _,'                   `.\n" +
                                    "                ,-\"\"'         ,'      ,--'-    `;'                       `.\n" +
                                    "               ,'            ,'      (      `. ,'                          `.\n" +
                                    "               ;            ,'        \\    _,','                            `.\n" +
                                    "              ,'            ;          `--'  ,'                              `.\n" +
                                    "             ,'             ;          __    (                    ,           `.\n" +
                                    "             ;              `____...  `78b   `.                  ,'           ,'\n" +
                                    "             ;    ...----'''' )  _.-  .d8P    `.                ,'    ,'    ,'\n" +
                                    "_....----''' '.        _..--\"_.-:.-' .'        `.             ,''.   ,' `--'\n" +
                                    "              `\"      \"\" _.-'' .-'`-.:..___...--' `-._      ,-\"'   `-'\n" +
                                    "        _.--'       _.-'    .'   .' .'               `\"\"\"\"\"\n" +
                                    "  __.-''        _.-'     .-'   .'  /\n" +
                                    " '          _.-' .-'  .-'        .'\n" +
                                    "        _.-'  .-'  .-' .'  .'   /\n" +
                                    "    _.-'      .-'   .-'  .'   .'\n" +
                                    "_.-'       .-'    .'   .'    /\n" +
                                    "       _.-'    .-'   .'    .'\n" +
                                    "    .-'            .'\n");
                            System.out.println("T    H    E     E     N     D");myMethod();
                        }
                            int power = in.nextInt(); //creating the next variable to store the user input
                            if (power == 1) { //checking if the user input is the integer 1
                                System.out.println("\"If power is what you seek, it is what you may have.\"");myMethod();
                                System.out.println("So, you decline his offer and begin plotting a way to overthrow the ruler.");myMethod();
                                System.out.println("As you know, the king will be leaving for future invasions, leaving his kingdom vulnerable.");myMethod();
                                System.out.println("Now, all you need to do is develop a plan to turn Echbert's people against him.");myMethod();
                                System.out.println("Maybe asking your wife for advice is a smart idea.");myMethod();
                                System.out.println("If you agree with Ragnar, press1, No other options!");myMethod();
                            }
                            else if (power == 2) { //if the user input is not the integer 1, then it will execute the following:
                                System.out.println("Joining the King is a smart tactic in earning even more reputation from the ruler himself.");myMethod();
                                System.out.println("Don't be fooled, he may catch on to you if you start abusing your profound role.");myMethod();
                                System.out.println("The day comes when you board his viking ship.");myMethod();
                                System.out.println("It's large and magnificent! Indeed it has multiple shields on the side for great defence.");myMethod();
                                System.out.println("The best part about it is the large sail in the middle, you can use the wind to guide your direction.\n");myMethod();
                                System.out.println("_____|\\\n" +                               //ascii art of large viking ship
                                        "              _.--| VKG |:\n" +
                                        "             <____|.----||\n" +
                                        "                    .---''---,\n" +
                                        "                     ;..__..'    _...\n" +
                                        "                   ,'/  ;|/..--''    \\\n" +
                                        "                 ,'_/.-/':            :\n" +
                                        "            _..-'''/  /  |  \\    \\   _|/|\n" +
                                        "           \\      /-./_ \\;   \\    \\,;'   \\\n" +
                                        "           ,\\    / \\:  `:\\    \\   //    `:`.\n" +
                                        "         ,'  \\  /-._;   | :    : ::    ,.   .\n" +
                                        "       ,'     ::   /`-._| |    | || ' :  `.`.)\n" +
                                        "    _,'       |;._:: |  | |    | `|   :    `'\n" +
                                        "  ,'   `.     /   |`-:_ ; |    |  |  : \\\n" +
                                        "  `--.   )   /|-._:    :          |   \\ \\\n" +
                                        "     /  /   :_|   ;`-._;   __..--';    : :\n" +
                                        "    /  (    ;|;-./_  _/.-:'o |   /     ' |\n" +
                                        "   /  , \\._/_/_./--''/_|:|___|_,'        |\n" +
                                        "  :  /   `'-'--'----'---------'          |\n" +
                                        "  | :     O ._O   O_. O ._O   O_.      ; ;\n" +
                                        "  : `.      //    //    //    //     ,' /\n" +
                                        "~~~`.______//____//____//____//_______,'~\n" +
                                        "          //    //~   //    //\n" +
                                        "   ~~   _//   _//   _// ~ _//     ~\n" +
                                        " ~     / /   / /   / /   / /  ~      ~~\n" +
                                        "      ~~~   ~~~   ~~~   ~~~\n");
                                System.out.println("Pretty cool isn't it?!");myMethod();
                                System.out.println("Anyhow, you help sail the ship with the king himself. ");myMethod();
                                System.out.println("100s of other ships are apart of your great fleet.");myMethod();
                                System.out.println("Days pass by...");myMethod();
                                System.out.println("Weeks...");myMethod();
                                System.out.println("Essentially, a great deal of time has gone by and you become skeptical of the raid.");myMethod();
                                System.out.println("Have some faith Ragnar!");myMethod();
                                System.out.println("You must remain strong, for what's to come will determine your fate.");myMethod();
                                System.out.println("On a dark night, you begin hallucinating.");myMethod();
                                System.out.println("Reality hits you immediately and you look around...");myMethod();
                                System.out.println("All the ships are nowhere to be seen and you begin questioning everything around you.");myMethod();
                                System.out.println("\"Ragnar!\" you hear the king yell near you.");myMethod();
                                System.out.println("Somewhere in the abyss, you notice all the boats have left you.");myMethod();
                                System.out.println("Stranded in the middle of the sea, you start losing motivation to keep going.");myMethod();
                                System.out.println("Betrayal it is..");myMethod();
                                System.out.println("Even with no signs of hope, you remain positive and cherish the final days of death.");myMethod();
                                System.out.println("After all, everybody was against you from the beginning, and yet here you are..");myMethod();
                                System.out.println("Smiling through the storm.");myMethod();
                                System.out.println("Your hands become cold, you lose vision, smiling until the last breath.");myMethod();
                                System.out.println("The final page is flipped, you are now in VALHALLA!");myMethod();
                                System.out.println("The gods delight you with love and compassion.");myMethod();
                                System.out.println("You see your wife and son.");myMethod();
                                System.out.println("They greet you and everyone feasts to your story.");myMethod();
                                System.out.println("Cheers, they say. Indeed, you stayed true to yourself until the end.");myMethod();
                                System.out.println("That's all that matters. :)");myMethod();
                                System.out.println("                                .-'`-.\n" +                 //ascii art of Ragnar Lothbrok, a great warrior
                                        "                               /  | | \\\n" +
                                        "                              /   | |  \\\n" +
                                        "                             |  __|_|___|\n" +
                                        "                             |' |||\n" +
                                        "                             |(   _L   ||\n" +
                                        "                             \\|`-'__`-'|'\n" +
                                        "                              |  `--'  |\n" +
                                        "                             _|        |-.\n" +
                                        "                         .-'| |  \\     /  `-.\n" +
                                        "                        /   | |\\     .'      `-.\n" +
                                        "                       /    | | `''''           \\\n" +
                                        "                      J     | |             _____|\n" +
                                        "                      |  |  J J         .-'   ___ `-.\n" +
                                        "                      |  \\   L L      .'  .-'  |  `-.`.\n" +
                                        "                      | \\|   | |     /  .'|    |    |\\ \\\n" +
                                        "                      |  |   J J   .' .'  |    |    | \\ \\\n" +
                                        "                      |  |    L L J  /    |    |    |  \\ L\n" +
                                        "                     /   |     \\ \\F J|    |    |    |   LJ\n" +
                                        "                     |   |      \\J F | () | () | () | ()| L\n" +
                                        "                    J  \\ |       FJ  |    |  / _`-. |   J |\n" +
                                        "                    |    |      J |  |    | //    \\ |   J |\n" +
                                        "                   J     |\\     | |  |    ||:(     ||   J |\n" +
                                        "                   |     | `----| |  |    ||::`._.:||   | F\n" +
                                        "                   |     /\\_    | |  |    ||:::::::F|   | F\n" +
                                        "                   |    |  /`---| |  |    | \\:::::/ |   FJ\n" +
                                        "                   F    |  / |  J |  |    |  `-:-'  |  J F\n" +
                                        "                  J_.--/  /  |  J J  | () | () | () |()FJ\n" +
                                        "                   |  |    /     L L |    |    |    | / F\n" +
                                        "                   |  |     |    \\ \\ |    |    |    |/ /\n" +
                                        "                 |`-. |    |     |\\ \\|    |    |    / /\n" +
                                        "                 J'\\ \\|    |     | `.`.   |    |  .'.'\n" +
                                        "                / .'> |    |     |  `-.`-.|____.-'.'\n" +
                                        "              .' /::'_|    |/    |    `-.______.-'\n" +
                                        "             / .::/   \\    |     |           |  |\n" +
                                        "           .' /::'     |--._     |           |--|\n" +
                                        "          / .::/       |    `-.__|     ____.-|//|\n" +
                                        "        .' /::'        |        F `--'      ||< |\n" +
                                        "       / .::/          |       J   |        FL\\\\|\n" +
                                        "     .' /::'           )       |   |        F| >|\n" +
                                        "    / .::/            (        \\   |        F|//|\n" +
                                        "  .' /::'              \\       /   |        F|--|\n" +
                                        " / .::/                 |` `' '(   (      ' J|  |\n" +
                                        "| /::'                  |  | ` \\   \\  `    / J  |\n" +
                                        "|_:/                    |  | | |    |`-  ''F J  J\n" +
                                        "                        |    ' F    |   \"\" |  `-'\n" +
                                        "                        |     J     |      |\n" +
                                        "                        |     /     |      |\n" +
                                        "                        |   .'      |      F\n" +
                                        "                       /---'(       J     J\n" +
                                        "                     .'     \\        L    |\n" +
                                        "                  .-'        )       L    F\n" +
                                        "                .'       .---'       \\__.-'\n" +
                                        "               (       .'             L   |\n" +
                                        "                `-----'               |   \\\n" +
                                        "                                      J    \\\n" +
                                        "                                       L    L\n" +
                                        "                                       |    F\n" +
                                        "                                       `-.-'\n");
                                System.out.println("T    H    E     E     N     D");
                                }
                                int agree = in.nextInt(); //creating the next variable to store the user input
                                if (agree == 1){ //checking if the user input is the integer 1
                                    System.out.println("Nice move. Check mate maybe, no just check.");myMethod();
                                    System.out.println("Learning from the past is significant to creating a brighter future.");myMethod();
                                    System.out.println("Once the King leaves, you begin telling many others of your past ventures.");myMethod();
                                    System.out.println("Soon, the word goes from person to person, and before you know it, everyone is talking about you.");myMethod();
                                    System.out.println("You inform them about another large village that is not to far from here.");myMethod();
                                    System.out.println("Eventually, they begin trusting you and day by day, you power and reputation rises.");myMethod();
                                    System.out.println("The day finally comes when the people agree with your intentions to raid.");myMethod();
                                    System.out.println("Now you have just assembled yourself an army of thousands of armed men and shield maidens.");myMethod();
                                    System.out.println("Even your wife is in awe and your son is more optimistic than ever.");myMethod();
                                    System.out.println("On a full moon, your people follow you to their ships, where they row and row in moon's light.");myMethod();
                                    System.out.println("Days go by, but you have achieved what many still dream of today.");myMethod();
                                    System.out.println("Finally, you arrive on land and see your old home where you and your family lived happily before \"they\" came.");myMethod();
                                    System.out.println("More war-ready than ever, you and your warriors join you to raid like no tomorrow!");myMethod();
                                    System.out.println("You yell: For Kattegat and valhalla!!");myMethod();
                                    System.out.println("Your warriors yell in anger and aggression, running to the gates of the village.\n");myMethod();
                                    System.out.println("                                          _.gd8888888bp._\n" +          //The axe of doom, a deadly symbol of death
                                            "                                        .g88888888888888888p.\n" +
                                            "                                      .d8888P\"\"       \"\"Y8888b.\n" +
                                            "                                      \"Y8P\"               \"Y8P'\n" +
                                            "                                         `.               ,'\n" +
                                            "                                           \\     .-.     /\n" +
                                            "                                            \\   (___)   /\n" +
                                            " .------------------._______________________:__________j\n" +
                                            "/                   |                      |           |`-.,_\n" +
                                            "\\###################|######################|###########|,-'`\n" +
                                            " `------------------'                       :    ___   l\n" +
                                            "                                            /   (   )   \\\n" +
                                            "                                           /     `-'     \\\n" +
                                            "                                         ,'               `.\n" +
                                            "                                      .d8b.               .d8b.\n" +
                                            "                                      \"Y8888p..       ,.d8888P\"\n" +
                                            "                                        \"Y88888888888888888P\"\n" +
                                            "                                           \"\"YY8888888PP\"\"\n");
                                    System.out.println("Axes everywhere, bodies left, right and centre. ");myMethod();
                                    System.out.println("Fighting until dawn, you are victorious!");myMethod();
                                    System.out.println("Everything happens for a reason and it seems you have gotten what you have always wanted....revenge.");myMethod();
                                    System.out.println("Your people are happy and casualties were lower than expected.");myMethod();
                                    System.out.println("Soon, these people want you to be king and in your own world, you realize how fast everything has happened.");myMethod();
                                    System.out.println("You finally made it! and the price was worth every tinker of gold.");myMethod();
                                    System.out.println("The end is near.. a kingdom to rule, new adventures to explore, the world is proud of you.");myMethod();
                                    System.out.println("Thank you for making the most out of what seemed so little.");myMethod();
                                    System.out.println("In the end, power is only given to those who are prepared to lower themselves to pick it up.");myMethod();
                                    System.out.println("What shall you do with this power? Now that's a story for another day or..night.");myMethod();
                                    System.out.println("You have fulfilled your legacy as a viking and shall rest in valhalla with the gods. Cheers!");myMethod();
                                    System.out.println("                     .-'`-.\n" +                    //ascii art of Ragnar Lothbrok, standing behind his great success!
                                            "                    / | |  \\\n" +
                                            "                   /  | |   \\\n" +
                                            "                  |___|_|__  |\n" +
                                            "                  ||| `|\n" +
                                            "                  ||   J_   )|\n" +
                                            "                  `|`-'__`-'|/\n" +
                                            "                   |  `--'  |\n" +
                                            "                 .-|        |_\n" +
                                            "              .-'  \\     /  | |`-.\n" +
                                            "           .-'      `.     /| |   \\\n" +
                                            "          /           ````' | |    \\\n" +
                                            "         |_____             | |     L\n" +
                                            "      .-' ___   `-.         F F  |  |    ||`-.___\n" +
                                            "    .'.-'  |  `-.  `.      J J   /  |    ||    _.>\n" +
                                            "   / /|    |    |`.  \\     | |   |/ |    ||_.-'\n" +
                                            "  / / |    |    |  `. `.   F F   |  |==============================\n" +
                                            " J /  |    |    |    \\  L J J    |  |      `:::::::.       `:::::::.\n" +
                                            " FJ   |    |    |    |L J/ /     |   \\       :::::::.        :::::::\\\n" +
                                            "J |() | () | () | () | J L/      |   |        :::::::         :::::::L\n" +
                                            "| F   | .-'_ \\  |    |  LJ       | /  L       ::::::::        :::::::J\n" +
                                            "| L   | /    \\\\ |    |  | L      |    |       ::::::::        ::::::::L\n" +
                                            "| L   ||     ):||    |  | |     /|     L      ::::::::        ::::::::|\n" +
                                            "J |   ||:._.'::||    |  | |----' |     |      ::::::::        ::::::::|     .---.\n" +
                                            "J |   |J:::::::||    |  | |    _/\\     |      ::::::::        ::::::::|    /(@  o`.\n" +
                                            " LJ   | \\:::::/ |    |  | |---'\\  |    |      ::::::::        ::::::::|   |    /^^^\n" +
                                            " J L  |  `-:-'  |    |  | F  | \\  |    J      ::::::::        ::::::::|    \\ . \\vvv\n" +
                                            "  LJ()| () | () | () |  F F  |  \\  \\--._L     ::::::::        ::::::::|     \\ `--'\n" +
                                            "  J \\ |    |    |    | J J     \\    |  |      ::::::::        ::::::::|      \\ `.\n" +
                                            "   \\ \\|    |    |    | / /    |     |  |      ::::::::        ::::::::|       L  \\\n" +
                                            "    \\ \\    |    |    |/ /|     |    | .-'|    ::::::::        ::::::::|       |   \\\n" +
                                            "     `.`.  |    |   .'.' |     |    |/ /`L    ::::::::        ::::::::|       |    L\n" +
                                            "     | `.`-.____|.-'.-'  |     |    | <`. \\   ::::::::        ::::::::|       |    |\n" +
                                            "     | | `-.______.-'    |    \\|    |_`::\\ `. ::::::::        ::::::::|       F    |\n" +
                                            "     | J\\ |  |           |     |    /:  \\::. \\::::::::        ::::::::F      /     |\n" +
                                            "     |  L\\|--|           |     _.--|::   `::\\ `.::::::       .:::::::J      /      F\n" +
                                            "     J  J |\\\\|-.____     |__.-'    |:      \\::. \\::::        ::::::::F    .'      J\n" +
                                            "      L  \\| >||      `--' J        |'      .`::\\ `.:'      .::::::::/   .'        F\n" +
                                            "      J   |//JJ        |   L       |---.   .--\\::. \\---.   .---.   <---<         J\n" +
                                            "       L  |< |J        |\\=/|       ( _  \\=/  _ `::\\ `.  \\=/  _  \\=/  _  \\       /\n" +
                                            "       J  |\\\\|J        | | /        )_)  |  (_)  \\::. \\  |  (_)  |  (_)  |     /\n" +
                                            "        \\ |--|J        |//\\\\       /    //\\     //`::\\ `./\\     //\\     /    .'\n" +
                                            "         \\|  |L `      )/  )` `' '|`---//  `---//  `\\::. \\ `---//  `---'   .'\n" +
                                            "  ________|  L_\\    '  /___/ ' |  |___//______//_____`::\\ |___//_________.'_________\n" +
                                            "          F  F J``  -'|    | | |  |                    \\:_|\n" +
                                            "          `-'  | \"\"   |    J `    |\n" +
                                            "               |      |     L     |          |\\    |\\          /|   /| |\\     /|\n" +
                                            "               |      |     \\     |          | \\   | \\        //   //  | \\    ||  |\\\n" +
                                            "               J      |      `.   |          ||\\\\  ||\\\\      //   //   ||\\\\   ||  ||\n" +
                                            "                L     F       )`---\\         || >> || \\\\    / |  <<    || \\\\  ||  ||\n" +
                                            "                |    J        /     `.       ||//  ||  ||  //||   \\\\   ||  || ||  ||\n" +
                                            "                J    J       (        `-.    |//   | \\ || |/ ||    \\\\  | \\ || ||  ||\n" +
                                            "                `-.__/       `---.       `.  |<<   ||\\\\||    ||     >> ||\\\\|| ||  ||\n" +
                                            "                |   J             `.       ) ||\\\\  || \\ |    ||    //  || \\ | ||  ||\n" +
                                            "                /   |               `-----'  || >> ||  ||    ||   //   ||  ||  \\\\ ||\n" +
                                            "               /    F                        ||//  ||  ||    ||  <<    ||  ||   \\\\||\n" +
                                            "              J    J                         | /   |/  ||    |/   \\\\   |/  ||    \\ |\n" +
                                            "              J    |                         |/        \\|          \\|      \\|     \\|\n" +
                                            "               `-.-'                         K I N G   O F   T H E   M O N S T E R S\n");
                                    System.out.println("T    H    E     E     N     D");
                                }
                            }
                        }