package life.zhuyuan.community.mapper;

import life.zhuyuan.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);
}