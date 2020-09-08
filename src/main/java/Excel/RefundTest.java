package Excel;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.Map;

/**
 * @author dyh
 * @date 2020/9/7
 */
public class RefundTest {

    public static void main(String[] args) {
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("D:\\project\\maventest\\src\\main\\java\\Excel\\待导入数据.xlsx"));
        List<Map<String, Object>> maps = reader.readAll();

        for (Map<String, Object> map : maps) {
            StringBuilder sb = new StringBuilder("INSERT INTO Order_RefundApprover ( ApproverId, AuditStage, CourseType, ProjectDepartId, CourseSubType, IsDefualt, Create_By ) VALUES (");
            sb.append(map.get("审批人ID")+",").append(map.get("审核阶段ID")+",").append(map.get("项目ID")+",").append(map.get("团队ID")+",").append(map.get("产品性质ID")+",")
                    .append(1).append(",").append(37974).append(");");
            System.out.println(sb);
        }
    }

    private static void export() {
        FileReader fileReader = new FileReader("D:\\project\\maventest\\src\\main\\java\\Excel\\退款审批数据.json");
        String result = fileReader.readString();
        Refund refund = JSON.parseObject(result, Refund.class);
        List<Refund.ResultBean.BodyBean> body = refund.getResult().getBody();
        List<Map<String, Object>> rs = Lists.newArrayList();
        for (Refund.ResultBean.BodyBean bodyBean : body) {
            Map<String, Object> item = Maps.newLinkedHashMap();
            item.put("项目", bodyBean.getCourseTypeName());
            item.put("项目id", bodyBean.getCourseType());
            item.put("产品性质",bodyBean.getCourseSubTypeName());
            item.put("产品性质id",bodyBean.getCourseSubType());
            item.put("审核阶段", bodyBean.getAuditStageName());
            item.put("审核阶段id", bodyBean.getAuditStage());
            item.put("团队", bodyBean.getProjectDepartName());
            item.put("团队id", bodyBean.getProjectDepartId());
            item.put("审批人", bodyBean.getApproverUserName());
            item.put("审批人id", bodyBean.getApproverId());
            rs.add(item);
        }
        ExcelWriter excelWriter = ExcelUtil.getWriter("D:\\project\\maventest\\src\\main\\java\\Excel\\退款审批数据.xlsx");
        ExcelWriter write = excelWriter.write(rs, true);
        write.close();
    }
}
