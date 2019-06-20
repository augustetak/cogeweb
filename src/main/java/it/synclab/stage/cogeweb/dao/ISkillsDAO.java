package it.synclab.stage.cogeweb.dao;

import java.util.List;

import it.synclab.stage.cogeweb.entities.Skills;

public interface ISkillsDAO {
	public void deleteSkill(Skills skill);
    public void addSkill(Skills skill);
    public List<Skills> findAllSkill();
    public List<Skills> findSkillByKey(String field,String key);
    public List<Skills> UpdateSkill(Skills conditionSkill,Skills operationSkill);

}
