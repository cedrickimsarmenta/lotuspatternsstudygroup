package com.patterns.decorator.blessie;

/**
 * Created by blessie on 09/08/2017.
 */
public class CharacterDecorator implements Story {

    private Story story;
    private String character;

    public CharacterDecorator(Story story, String character){
        this.story = story;
        this.character = character;
    }


    @Override
    public void tellStory() {
        story.tellStory();
        System.out.print("a wild "+character+" appeared! ");
    }
}
