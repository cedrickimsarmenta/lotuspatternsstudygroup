package com.patterns.decorator.blessie;

/**
 * Created by blessie on 09/08/2017.
 */
public class EndingDecorator implements Story {

    private Story story;
    private String ending;

    public EndingDecorator(Story story, String ending){
        this.story = story;
        this.ending = ending;
    }

    @Override
    public void tellStory() {
        story.tellStory();
        System.out.print("In the end, "+ ending+". ");
    }
}
