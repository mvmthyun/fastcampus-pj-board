package fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long article_id;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
