package com.google.devrel.training.conference.domain;

import com.googlecode.objectify.annotation.Cache;


public class Announcement {
	
private String message;

public Announcement() {
}

public Announcement(String message) {
this.message = message;
}

public String getMessage() {
return message;
}
}