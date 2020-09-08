package Excel;

import lombok.Builder;
import lombok.Data;

/**
 * @author dyh
 * @date 2020/8/31
 */
@Data
@Builder
public class Dictionary {
    private Integer id;
    private String name;
    private Integer type;
    private Long parentId;

}
