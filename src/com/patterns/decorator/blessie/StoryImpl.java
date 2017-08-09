package com.patterns.decorator.blessie;

/**
 * Created by blessie on 09/08/2017.
 */
public class StoryImpl implements Story {

    private String storyDesc;

    public StoryImpl(String storyDesc){
        this.storyDesc = storyDesc;
    }

    @Override
    public void tellStory() {
        System.out.print(storyDesc);
    }
}
