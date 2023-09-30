/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Exercise 2 - OurSuperCoolSpyApplication
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.OurSuperCoolSpy;

public class Mission {
    private String missionTitle;
    private String gadget;

    public Mission(String missionTitle, String gadget) {
        this.missionTitle = missionTitle;
        this.gadget = gadget;
    }

    public String getMissionTitle() {
        return missionTitle;
    }

    public void setMissionTitle(String missionTitle) {
        this.missionTitle = missionTitle;
    }

    public String getGadget() {
        return gadget;
    }

    public void setGadget(String gadget) {
        this.gadget = gadget;
    }
}
//end