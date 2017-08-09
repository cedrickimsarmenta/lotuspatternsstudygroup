package com.patterns.decorator.blessie;

/**
 * Created by blessie on 09/08/2017.
 */
public class StoryTeller {

    public static void main(String[] args){
        Story story = new StoryImpl("Once upon a time, ");
        Story storyWithCharacter = new CharacterDecorator(story, "zubat");
        Story storyWithEvent = new EventDecorator(storyWithCharacter, "it attacked your party");
        Story storyWithEvent2 = new EventDecorator(storyWithEvent, "you tried to run");
        Story storyWithEnding = new EndingDecorator(storyWithEvent2, "you were eaten alive by a swarm of zubats");

        storyWithEnding.tellStory();
    }
}
