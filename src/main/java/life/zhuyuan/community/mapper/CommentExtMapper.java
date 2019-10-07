package life.zhuyuan.community.mapper;

import life.zhuyuan.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}