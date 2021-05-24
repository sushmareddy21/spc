package com.cg.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "diary_details")
public class DiaryDetails {
	@Id
	@GeneratedValue
	private int detailsId;
	private LocalDate detailsDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "diary_notes_id")
	private DiaryNotes diaryNotes;
	public DiaryDetails() {
	}
	public int getDetailsId() {
		return detailsId;
	}
	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}
	public LocalDate getDetailsDate() {
		return detailsDate;
	}
	public void setDetailsDate(LocalDate detailsDate) {
		this.detailsDate = detailsDate;
	}
	public DiaryNotes getDiaryNotes() {
		return diaryNotes;
	}
	public void setDiaryNotes(DiaryNotes diaryNotes) {
		this.diaryNotes = diaryNotes;
	}
	@Override
	public String toString() {
		return "DiaryDetails [detailsId=" + detailsId + ", detailsDate=" + detailsDate + ", diaryNotes=" + diaryNotes
				+ "]";
	}
	
}