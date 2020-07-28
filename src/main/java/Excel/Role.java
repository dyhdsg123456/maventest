package Excel;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.List;
import java.util.Map;

/**
 * @author dyh
 * @date 2020/7/28
 */
public class Role {
    public static void main(String[] args) {
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("角色分系统.xls"));
        List<Map<String, Object>> maps = reader.readAll();
        System.out.println(maps);

    }
}
