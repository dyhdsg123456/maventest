package Excel;

import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dyh  清洗角色数据
 * @date 2020/7/28
 */
public class Role {
    public static void main(String[] args) {
        ExcelReader reader = ExcelUtil.getReader(FileUtil.file("D:\\project\\maventest\\src\\main\\java\\Excel\\角色分系统.xls"));
        List<Map<String, Object>> maps = reader.readAll();
        System.out.println(maps);
        HashMap<Long, List<Long>> result = new HashMap<Long, List<Long>>();

        for (Map<String, Object> map : maps) {
            Long appId = (Long) map.get("AppId");
            if(appId==190711){
                continue;
            }
            if(result.containsKey(appId)){
                List<Long> integers = result.get(appId);
                integers.add((Long) map.get("RoleId"));
            }else {
                ArrayList<Long> roleids = new ArrayList<>();
                roleids.add((Long) map.get("RoleId"));
                result.put(appId,roleids);
            }
        }
        String s="update tpo_sys_roles set AppId = ";
        for (Long aLong : result.keySet()) {
            String s1 = s + aLong + " where RoleId in (";
            List<Long> longs = result.get(aLong);

            for (int i = 0; i < longs.size(); i++) {
                if(i==longs.size()-1){
                    s1=s1+longs.get(i);
                }else {
                    s1=s1+longs.get(i)+",";
                }

            }
            s1=s1+" ) ;";
            System.out.println(s1);
        }
//        System.out.println(result);
    }
}
