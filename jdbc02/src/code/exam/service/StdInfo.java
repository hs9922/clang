package code.exam.service;

import java.util.List;

public class StdInfo {

	private int stdId;
	private String stdName;
	private int stdGrade;
	private List<StdScore>scoreList;
	
	
	public List<StdScore> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<StdScore> scoreList) {
		this.scoreList = scoreList;
	}

	public int getStdId() {
		return stdId;
	}
	
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(int stdGrade) {
		this.stdGrade = stdGrade;
	}
	
	
}
