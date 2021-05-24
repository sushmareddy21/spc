package com.cg.entities;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "diarynotes")
public class DiaryNotes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int diaryNotesId;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "attributes_id")	
	private NotesAttribute attributes;
	
//	@JoinColumn(name = "classdiary_classDiaryId")
//	@ElementCollection
//	@MapKeyColumn(name="subjects")
//	@Column(name="read")
//	@CollectionTable(name="books", joinColumns=@JoinColumn(name="classdiary_classDiaryId"))
//	Map<Subject, String> attributes = new HashMap<>();

//    @ElementCollection
//	@MapKeyColumn(name="subnotes")
//	@Column(name="write")
//	@CollectionTable(name="notes", joinColumns=@JoinColumn(name="classdiary_classDiaryId"))
//	private Map<String,String> notes = new HashMap<>();
	
	public DiaryNotes() {
	}
//	public DiaryNotes(int diaryNotesId, Map<Subject, String> notes) {
//		super();
//		this.diaryNotesId = diaryNotesId;
//		this.notes = notes;
//	}
	public int getDiaryNotesId() {
		return diaryNotesId;
	}
	public void setDiaryNotesId(int diaryNotesId) {
		this.diaryNotesId = diaryNotesId;
	}
//	public Map<String, String> getNotes() {
//		return notes;
//	}
//	public void setNotes(Map<String, String> notes) {
//		this.notes = notes;
//	}

	@Override
	public String toString() {
		return "DiaryNotes [diaryNotesId=" + diaryNotesId + ", attributes=" + attributes + "]";
	}
	public NotesAttribute getAttributes() {
		return attributes;
	}
	public void setAttributes(NotesAttribute attributes) {
		this.attributes = attributes;
	}
	
}