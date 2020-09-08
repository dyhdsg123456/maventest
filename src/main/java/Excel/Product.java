package Excel;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dyh
 * @date 2020/8/31
 */
public class Product {
    public static void main(String[] args) {
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("D:\\project\\maventest\\src\\main\\java\\Excel\\CFA+双证+FRM产品清洗-0903-V3.xlsx"));
        List<Map<String, Object>> maps = reader.readAll();
        int id=100523915;
        HashMap<String, Dictionary> result = new HashMap<>();
        for (Map<String, Object> map : maps) {
            String name = (String) map.get("NEW产品模块");
            String name2 = (String) map.get("NEW产品类型");
            String name3 = (String) map.get("NEW产品性质");
            Long parentId = (Long) map.get("parentId");
            String key1 = name + parentId;
            String key2 = name2 + parentId;
            String key3 = name3 + parentId;
            if(!result.containsKey(key1)){
                Dictionary a = Dictionary.builder().id(id).name(name).parentId(parentId).type(10033).build();
                result.put(key1,a);
                id++;
            }
            if(!result.containsKey(key2)){
                Dictionary b = Dictionary.builder().id(id).name(name2).parentId(parentId).type(10032).build();
                result.put(name2+parentId,b);
                id++;
            }
            if(!result.containsKey(key3)){
                Dictionary c = Dictionary.builder().id(id).name(name3).parentId(parentId).type(20052).build();
                result.put(name3+parentId,c);
                id++;
            }

        }

        for (Map.Entry<String,Dictionary> entry :result.entrySet()) {
            Dictionary value = entry.getValue();
            StringBuilder sb = new StringBuilder("INSERT IGNORE INTO Tpo_Base_Dictionary ( id, `Type`, `Name`, ParentId,CreateBy) VALUES (");
            sb.append(value.getId()).append(",").append(value.getType()).append(",").append("'").append(value.getName()).append("',")
                    .append(value.getParentId()).append(",").append(37974);
            sb.append(" );");
            System.out.println(sb.toString());
        }
    }
}
