package com.fieryslug.linguo.util.alma;

import java.util.ArrayList;

public class Group implements IWithName {

    public String title;
    public ArrayList<Deck> decks;

    public Group() {
        this("", new ArrayList<>());
    }

    public Group(String title, ArrayList<Deck> decks) {
        this.title = title;
        this.decks = decks;
    }

    @Override
    public String getName() {
        return this.title;
    }
}
