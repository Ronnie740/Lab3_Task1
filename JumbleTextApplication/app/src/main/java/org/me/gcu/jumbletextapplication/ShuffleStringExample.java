package org.me.gcu.jumbletextapplication;

import java.util.*;
public class ShuffleStringExample
{
   public String Jumble(String s)
    {

        List<String> characters = Arrays.asList(s.split(""));
        Collections.shuffle(characters);
        String afterShuffle = "";
        for (String character : characters)
        {
            afterShuffle += character;
        }
        return afterShuffle;
    }
}
