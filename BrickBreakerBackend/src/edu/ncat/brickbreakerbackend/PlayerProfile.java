package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;

/* Student Name: Erick Blanco
o Date: 09/26/2024
o Class / Section: Comp 167- 003
o This class will be creating and editing a playerprofile
 */
public class PlayerProfile {
    //declare private fields
    private String name;
    private int numGamesPlayed;
    private int highScore;
    private ArrayList<String> savedGames = new ArrayList<>();

    //no-arg constructor
    public PlayerProfile() {
        name = "Erick";
        savedGames = new ArrayList<>();
    }

    //parameterized constructor
    public PlayerProfile(String name) {
        this.name = name;
        savedGames = new ArrayList<>();
    }

    //toString to output Player information
    @Override
    public String toString() {
        String result = name + System.getProperty("line.separator") + numGamesPlayed + System.getProperty("line.separator")
                + highScore + System.getProperty("line.separator");
        for (int i = 0; i < savedGames.size(); i++) {
            this.savedGames.add(name);
        }
        return result;
    }

    //returns the amount of saved games
    public int getSavedGames() {
        return savedGames.size();
    }

    //chooses a saved game at specific location
    public String getSavedGame(int index) {
        if (index >= 0 && index < savedGames.size()) {
            return savedGames.get(index);
        } else {
            return "index chosen was out of bounds. Error";
        }
    }

    // sets a saved game at a specific location
    public void setSavedGame(int index, String game) {
        savedGames.set(index, game);
    }

    //adds a game to the end of the savedGames list
    public void addSavedGame(String game) {
        savedGames.add(game);
    }
    //deletes and returns the saved game
    public String deleteSavedGame(int index) {
        if (index >= 0 && index < savedGames.size()) {
            return savedGames.remove(index);
        }
        else {
            return "Error";
        }
    }
    //getters and setters for the private fields
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getNumGamesPlayed() {
        return numGamesPlayed;
    }

    public void setNumGamesPlayed(int numGamesPlayed) {
        this.numGamesPlayed = numGamesPlayed;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

}
