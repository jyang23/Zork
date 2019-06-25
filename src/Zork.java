import java.util.Scanner;
import java.util.Random;

public class Zork {


    public static String foyer(String room, Scanner input,String move)
    {
        System.out.println("You are currently in the foyer");
        System.out.println("There is a dead scorpion in the room");
        System.out.println("Would you like to go \"N\"(north) or \"EX\"(exit)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("n"))
            {
                room = "Front Room";
                break;
            }
            else if(move.equals("ex"))
            {
                room = "Exit";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }


    public static String front_room(String room, Scanner input,String move)
    {
        System.out.println("You are currently in the front room");
        System.out.println("There is a piano in the room");
        System.out.println("Would you like to go \"W\"(west),\"S\"(south),or\"E\"(east)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Library";
                break;
            }
            else if(move.equals("s"))
            {
                room = "Foyer";
                break;
            }
            else if(move.equals("e"))
            {
                room = "Kitchen";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String library(String room, Scanner input,String move)
    {
        System.out.println("You are currently in the library");
        System.out.println("There are spiders in the room");
        System.out.println("Would you like to go \"N\"(north) or \"E\"(east)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("n"))
            {
                room = "Dining Room";
                break;
            }
            else if(move.equals("e"))
            {
                room = "Front Room";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String kitchen(String room, Scanner input,String move)
    {
        System.out.println("You are currently in kitchen");
        System.out.println("There are bats flying in the room");
        System.out.println("Would you like to go \"N\"(north) or \"W\"(west)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Front Room";
                break;
            }
            else if(move.equals("n"))
            {
                room = "Parlor";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String dining_room(String room, Scanner input,String move)
    {
        System.out.println("You are currently in the dining room");
        System.out.println("It is full of dust in the room and an empty box");
        System.out.println("Would you like to go \"S\"(south)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("s"))
            {
                room = "Library";
                break;
            }

            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String vault(String room, Scanner input,String move,int r,boolean f)
    {
        System.out.println("You are currently in vault");
        System.out.println("There three walking skeletons in the room");
        System.out.println("Would you like to go \"E\"(east)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("e"))
            {
                if(r == 1 || f == true)
                {
                    room = "Secret Room";
                    break;
                }
                else
                {
                    room = "Parlor";
                    break;
                }
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }
    public static String vault2(String room, Scanner input,String move,int r,boolean f)
    {
        System.out.println("You are currently in vault");
        System.out.println("There three walking skeletons in the room");
        System.out.println("Would you like to go \"NE\"(east) to the secret room or \"SE\"(southeast)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("ne"))
            {
                room = "Secret Room";
                break;
            }
            else if(move.equals("se"))
            {
                room = "Parlor";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String parlor(String room, Scanner input,String move)
    {
        System.out.println("You are currently in parlor");
        System.out.println("There is a treasure chest in the room");
        System.out.println("Would you like to go \"W\"(west) or \"S\"(south)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Vault";
                break;
            }
            else if(move.equals("s"))
            {
                room = "Kitchen";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String secret_room(String room, Scanner input,String move)
    {
        System.out.println("You are currently in the secret room");
        System.out.println("HOLY, there are piles of gold in the room");
        System.out.println("Would you like to go \"W\"(west)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Vault";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static int secret()
    {
        Random rand = new Random();
        int number = 1+rand.nextInt(5);
        return number;
    }


    public static void main(String[] args) {


        System.out.println("ZORK: Beware of the Haunted Castle");

        Scanner in = new Scanner(System.in);
        String room = "Foyer";
        boolean flag = false;
        boolean found = false;
        String move = "";
        String quit;
        int r;
        int rooms = 0;



        while(true)
        {
            if(room.equals("Foyer"))
            {
                room = foyer(room, in, move);
                rooms++;
            }
            else if(room.equals("Front Room"))
            {
                room = front_room(room, in, move);
                rooms++;
            }
            else if(room.equals("Library"))
            {
                room = library(room, in, move);
                rooms++;
            }
            else if(room.equals("Kitchen"))
            {
                room = kitchen(room, in, move);
                rooms++;
            }
            else if(room.equals("Dining Room"))
            {
                room = dining_room(room, in, move);
                rooms++;
            }
            else if(room.equals("Vault"))
            {
                r = secret();
                if(r == 1)
                {
                    found = true;
                }
                if(found == true && flag == true)
                {
                    room = vault2(room, in, move, r, found);
                    rooms++;
                }
                else if(found == true)
                {
                    room = vault(room, in, move, r, found);
                    flag = true;
                    rooms++;
                }
                else
                {
                    room = vault(room, in, move, r, found);
                    rooms++;
                }
            }
            else if(room.equals("Parlor"))
            {
                room = parlor(room, in, move);
                rooms++;
            }
            else if(room.equals("Secret Room"))
            {
                room = secret_room(room, in, move);
                rooms++;
            }
            else
            {
                System.out.println("Would you like to Exit and runaway \"Y\" or \"N\"?");
                quit = in.nextLine();
                quit = quit.toLowerCase();
                if(quit.equals("y"))
                {
                    r = secret();
                    if(r == 4)
                    {
                        System.out.println("You entered "+rooms+" number of rooms!");
                        System.out.println("You are being followed by a ghost! BOO");
                        break;
                    }
                    else
                    {
                        System.out.println("You entered "+rooms+" number of rooms!");
                        System.out.println("Safe Travels, come back soon!!");
                        break;
                    }
                }
                else
                {
                    room = "foyer";
                }
            }
        }
    }
}
