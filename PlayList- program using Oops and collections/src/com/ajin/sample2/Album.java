package com.ajin.sample2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for (int i = 0; i < songs.size(); i++) {
			if (songs.get(i).getTitle().equals(title)) {
				return songs.get(i);
			}
		}
		return null;
	}

	public boolean addToPlayList(int track, LinkedList<Song> playList) {
		int trackNo = track - 1;
		if (trackNo <= songs.size()) {
			ListIterator<Song> i = playList.listIterator();
			while (i.hasNext()) {
				if (i.next().getTitle().compareTo(songs.get(trackNo).getTitle()) > 0) {
					i.previous();
					i.add(songs.get(trackNo));
					return true;
				} else if (i.next().getTitle().compareTo(songs.get(trackNo - 1).getTitle()) == 0) {
					return false;
				} else {

				}
			}
			i.add(songs.get(trackNo));
			return true;
		}
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		if (findSong(title) != null) {
			ListIterator<Song> i = playList.listIterator();
			while (i.hasNext()) {
				if (i.next().getTitle().compareTo(findSong(title).getTitle()) > 0) {
					i.previous();
					i.add(findSong(title));
					return true;
				} else if (i.next().getTitle().compareTo(findSong(title).getTitle()) == 0) {
					return false;
				} else {

				}
			}
			i.add(findSong(title));
			return true;
		}
		return false;
	}
}
