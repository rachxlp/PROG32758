/*
 * Name:  Rachel Prasad
 * Student ID: 991702269
 * Assignment:  Exercise 2 - OurSuperCoolSpyApplication
 * Program: Computer Systems and Network Engineering (Co-op)
 */

package ca.sheridancollege.OurSuperCoolSpy.controllers;

import ca.sheridancollege.OurSuperCoolSpy.Mission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MissionController {
    private List<Mission> missions = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/missions")
    public String getMissions(Model model) {
        model.addAttribute("missions", missions);
        return "missions";
    }

    @GetMapping("/addMission")
    public String addMissionForm() {
        return "missionSubmitted";
    }

    @GetMapping("/mission_listing")
    public String missionListing() {
        return "mission_listing";
    }

    @GetMapping("/view_missions")
    public String viewMissions(Model model) {
        model.addAttribute("missions", missions);
        return "mission_listing";
    }

    @PostMapping("/addMission")
    public String addMission(@RequestParam String missionTitle, @RequestParam String gadget, Model model) {
        Mission mission = new Mission(missionTitle, gadget);
        missions.add(mission);

        // Set attributes for the "missionSubmitted" page
        model.addAttribute("missionName", missionTitle);
        model.addAttribute("gadgetName", gadget);

        return "missionSubmitted";
    }
}
