package com.patterns.decorator.blessie;

/**
 * Created by blessie on 09/08/2017.
 */
public class EventDecorator implements Story {

    private Story story;
    private String event;

    public EventDecorator(Story story, String event){
        this.story = story;
        this.event = event;
    }

    @Override
    public void tellStory() {
        story.tellStory();
        System.out.print("Then, "+event+". ");
    }
}
