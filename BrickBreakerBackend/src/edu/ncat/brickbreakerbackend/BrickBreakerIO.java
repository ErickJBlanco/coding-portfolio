package edu.ncat.brickbreakerbackend;

/* Student Name: Erick Blanco
o Date: 09/26/2024
o Class / Section: Comp 167- 003
o This class will be reading and editing files for the BrickBreaker.
 */
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import javafx.scene.paint.Color;
public class BrickBreakerIO {
    public static Level[] readConfigFile(String cFileName) {
        //try-catch block for dealing with files
        try {
            //open and read from configFile
            File configFile = new File(cFileName);
            Scanner read = new Scanner(configFile);
            int numLevel = read.nextInt(); //get data about number of level objects to create
            Level[] levelArrays = new Level[numLevel];//create the level array that holds level objects

            //gather information from configFile
            //for loop to create Level objects
            for (int i = 0; i < levelArrays.length; i++) {
                int levelNum = read.nextInt(); //get level number for current level
                int brickRowLength = read.nextInt(); //get how many rows of bricks on this level
                //fill array with level objects
                Level level = new Level(levelNum, brickRowLength);  //new level object
                //nested for loop to fill brickRow array
                for (int j = 0; j < brickRowLength; j++) {
                    int brickRowNum = read.nextInt();// brick row number
                    Color clr = Color.rgb(read.nextInt(), read.nextInt(), read.nextInt()); //get rgb values
                    int pointValue = read.nextInt();//get pointValue
                    read.nextLine();
                    String brickMask = read.next();
                    BrickRow brickRow = new BrickRow(pointValue, clr, brickMask);
                    level.setBrickRow(brickRowNum, brickRow);//create brickRow object
                }
                levelArrays[i] = level;
            }
            read.close();
            return levelArrays;
            //for any errors
        } catch (FileNotFoundException e) {
            System.out.println("This is the problem");
            throw new RuntimeException(e);
        }
    }

    public static void readProfiles(GameProfiles gameProfile, String profileFileName) {
        //read profiles and add profiles to game profiles
        try {
            //open and read files
            File fName = new File(profileFileName);
            Scanner read = new Scanner(fName);

            //read the player profile data from profileFileName
            while (read.hasNextLine()) {
                String name = read.nextLine(); //reads the name value
                int numGamesPlayed = Integer.parseInt(read.nextLine());//reads played games value
                int highScore = Integer.parseInt(read.nextLine()); //read high score
                int numSavedGames = Integer.parseInt(read.nextLine()); //read number of saved games for for loop
                //create profile object
                PlayerProfile profile = new PlayerProfile(name);
                profile.setNumGamesPlayed(numGamesPlayed);
                profile.setHighScore(highScore);

                //create the loop to add saved games
                for(int i = 0; i < numSavedGames; i++) {
                    String savedGame = read.nextLine();
                    profile.addSavedGame(savedGame); //adds saved games to profile
                }

                //add profile to gameprofiles
                gameProfile.addPlayerProfile(profile);
            }
            read.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeProfiles(GameProfiles gameProfile, String playerFileName) throws IOException {
        //open a writer
        FileWriter write = new FileWriter(playerFileName);
        write.write(gameProfile.toString());
        write.close();
    }
}