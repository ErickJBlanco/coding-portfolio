package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;

/* Student Name: Erick Blanco
o Date: 09/26/2024
o Class / Section: Comp 167- 003
o This class will be holding all of the gameprofiles

 */
public class GameProfiles {
    //declare private fields
    private PlayerProfile selectedProfile;
    private PlayerProfile highGameProfile;
    private ArrayList<PlayerProfile> profiles;
    private String profileFileName;

    //no-arg constructor
    public GameProfiles() {
        setSelectedProfile(null);
        setHighGameProfile(null);
        profiles = new ArrayList<>();
        profileFileName = null;
    }

    //getters and setters"
    public PlayerProfile getSelectedProfile() {
        return selectedProfile;
    }

    public PlayerProfile getHighGameProfile() {
        return highGameProfile;
    }

    public void setHighGameProfile(PlayerProfile highGameProfile) {
        this.highGameProfile = highGameProfile;
    }

    public String getProfileFilename() {
        return profileFileName;
    }

    public void setProfileFilename(String profileFileName) {
        this.profileFileName = profileFileName;
    }

    //gets the profiles size
    public int getNumPlayerProfiles() {
        return profiles.size();
    }

    //gets the profile at a specific index
    public PlayerProfile getPlayerProfile(int index) {
        if (index >= 0 && index < profiles.size()) {
            return profiles.get(index);
        } else {
            return null;
        }
    }

    // sets a profile at a specific location
    public void setPlayerProfile(int index, PlayerProfile profile) {
        profiles.set(index, profile);
    }

    //adds a profile
    public void addPlayerProfile(PlayerProfile profile) {
        profiles.add(profile);
    }
    //deletes and returns the profile
    public PlayerProfile deletePlayerProfile(int index) {
        if (index >= 0 && index < profiles.size()) {
            return profiles.remove(index);
        }
        return null;
    }

    //set's player profile
    //FIXME: Where was this used
    public void setSelectedProfile(PlayerProfile profile) {
        selectedProfile = profile;
    }

    public String toString() {
        String result = getSelectedProfile() + System.getProperty("line.separator") + getHighGameProfile() +
                System.getProperty("line.separator") + profiles;
        return result;
    }
}