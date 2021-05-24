package com.cg.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "classdiary")
public class ClassDiary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classDiaryId;
	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
	@Column(name = "diary_details")
	private List<DiaryDetails> diaryDetails;
	
//	@ElementCollection
//	@MapKeyColumn(name="subjects")
//	@Column(name="read")
//	@CollectionTable(name="notes", joinColumns=@JoinColumn(name="diarynotes_diaryNotesId"))
//	private Map<LocalDate,DiaryNotes> diaryNotes;

	public ClassDiary() {
	}
//	public ClassDiary(int classDiaryId, Map<LocalDate, DiaryNotes> diaryNotes) {
//		super();
//		this.classDiaryId = classDiaryId;
//		this.diaryNotes = diaryNotes;
//	}
	public int getClassDiaryId() {
		return classDiaryId;
	}
	public void setClassDiaryId(int classDiaryId) {
		this.classDiaryId = classDiaryId;
	}
	public List<DiaryDetails> getDiaryDetails() {
		return diaryDetails;
	}
	public void setDiaryDetails(List<DiaryDetails> diaryDetails) {
		this.diaryDetails = diaryDetails;
	}
	@Override
	public String toString() {
		return "ClassDiary [classDiaryId=" + classDiaryId + ", diaryDetails=" + diaryDetails + "]";
	}
	
//	public Map<LocalDate, DiaryNotes> getDiaryNotes() {
//		return diaryNotes;
//	}
//	public void setDiaryNotes(Map<LocalDate, DiaryNotes> diaryNotes) {
//		this.diaryNotes = diaryNotes;
//	}
	
}