import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author dyh
 * @date 2020/5/9
 */
public class Testsort {
    public static void main(String[] args) {

        String s="[{\"refundFee\":0.01,\"payOrderId\":\"4200000555202005089675107026\",\"outRefundId\":\"67\",\"totalFee\":0.05,\"refundReason\":\"本人申请原路退回\",\"refundChannel\":\"PAY_CENTER\"}]";
        JSONArray objects = JSONArray.parseArray(s);
        System.out.println(JSON.toJSONString(objects, SerializerFeature.SortField));

    }
}
