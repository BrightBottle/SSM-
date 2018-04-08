package online.shixun.ssmresume.mapper;

import online.shixun.ssmresume.model.Skill;

import java.util.List;

/**
 * Created by 张罗平 on 2018/2/4.
 */
public interface SkillMapper {
    List<Skill> findSkill();
     void updateSkill(Skill skill);
}
