package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notesattribute_cp")
public class NotesAttribute {
	@Id
	@GeneratedValue
	int notesid;
	String subject;
	String notes;
	public NotesAttribute() {
	}
	public int getNotesid() {
		return notesid;
	}
	public void setNotesid(int notesid) {
		this.notesid = notesid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}