package com.falexo.reminder.server.controller;

import com.falexo.reminder.server.entity.Remind;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by newman on 08.02.2016.
 */
@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder() {
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setTitle("Test Event title");
        remind.setRemindDate(new Date());
        return remind;
    }
}
