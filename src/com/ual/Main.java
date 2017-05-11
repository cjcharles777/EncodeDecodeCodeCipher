package com.ual;

import java.io.Console;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner in;

        String inputString = null;
        try
        {
            // creates a console object
            in = new Scanner(System.in);
            // if console is not null
            if (in != null)
            {
                // read line from the user input
                System.out.println("Code or 'quit': ");
                inputString = in.nextLine();
                // prints
                while (!inputString.equals("quit"))
                {
                    System.out.println("Code entered : " + inputString);
                    System.out.println(encryptCode(inputString));
                    System.out.println("Code or 'quit': ");
                    inputString = in.nextLine();
                }
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }



    }

    public static String encryptCode (String string)
    {
        String result = "";
        String[] cipher = {
                "Elric",
                "Toguro",
                "Jajanken",
                "Red Ribbon",
                "Going Merry",
                "Sunflower Samurai",
                "Laughing Man",
                "Fujiko",
                "Hinata",
                "Vash",
                "Serin",
                "Lelouch",
                "White T Poison",
                "Oasi Pizza",
                "Spiral King",
                "Kyouma Hououin",
                "Faye Valentine",
                "Ryōzanpaku",
                "Migi",
                "Guts",
                "Conan Edogawa",
                "L",
                "Noblesse",
                "Sybil System",
                "Quindecim",
                "Harkonnen"
        };

        String input = string.toLowerCase();
        //Collections.reverse(Arrays.asList(cipher));
        //String [] cipherSplitParts = numberCode.split("-");
        boolean isStart = true;
        boolean isAfterSpace = false;
        char prefix = '-';
        for (char part : input.toCharArray())
        {
            if(part == ' ' )
            {
                result += part;
                isAfterSpace = true;
            }
            else
            {
                int cipherNumber = part - 'a' + 1;
                //result += (cipher[cipherNumber-1] + ' ');

                if(!isStart && !isAfterSpace)
                {
                    result += prefix;

                }

                result += (""+(cipherNumber * 2));
                isAfterSpace = false;
            }
            isStart = false;
        }
        return result;
    }
}
