package model;

public class Skill {
	
	private Long skillId;
	private String skillName;
	
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	public Skill(Long skillId, String skillName) {
		this.skillId = skillId;
		this.skillName = skillName;
	}

}
