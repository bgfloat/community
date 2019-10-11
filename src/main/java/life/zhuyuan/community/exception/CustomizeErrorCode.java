package life.zhuyuan.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001,"你找的问题不存在"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题"),
    NO_LOGIN(2003,"当前操作需要登陆请登录后再试"),
    SYS_ERROR(2004,"服务繁忙"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008,"兄弟，你这是读别人的信息呢？"),
    NOTIFICATION_NOT_FOUND(2009,"回复的消息不见了"),
    FILE_UPLOAD_FAIL(2010,"图片上传失败")
    ;

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

}
