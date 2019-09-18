package life.zhuyuan.community.dto;

import life.zhuyuan.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tags;
    private Long gmtCreate;
    private Long gmtmodified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;

}
