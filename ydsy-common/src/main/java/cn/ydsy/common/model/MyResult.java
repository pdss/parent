package cn.ydsy.common.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import cn.ydsy.common.enums.HttpResponseEnums;
import lombok.Data;
import lombok.ToString;
import org.apache.http.HttpResponse;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
public class MyResult implements Serializable {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;


    public static MyResult build(Integer status, String msg, Object data) {
        return new MyResult(status, msg, data);
    }

    public static MyResult build(HttpResponseEnums resp, Object data) {
        return new MyResult(resp, data);
    }

    public static MyResult ok(Object data) {
        return new MyResult(data);
    }

    public static MyResult ok() {
        return new MyResult(null);
    }

    public static MyResult error(String error) {
        return new MyResult(HttpResponseEnums.InternalServerError, error);
    }

    public static MyResult forb(String error) {
        return new MyResult(HttpResponseEnums.Forbidden.getValue(), error,"");
    }

    public MyResult() {

    }

    public MyResult(HttpResponseEnums resp, Object data) {
        this.status = resp.getValue();
        this.msg = resp.getMessage();
        this.data = data;
    }

    public static MyResult build(Integer status, String msg) {
        return new MyResult(status, msg, null);
    }

    public MyResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public MyResult(Object data) {
        this.status = HttpResponseEnums.Ok.getValue();
        this.msg = HttpResponseEnums.Ok.getMessage();
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == HttpResponseEnums.Ok.getValue();
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为TaotaoResult对象
     *
     * @param jsonData json数据
     * @param clazz    TaotaoResult中的object类型
     * @return
     */
    public static MyResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, MyResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static MyResult format(String json) {
        try {
            return MAPPER.readValue(json, MyResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz    集合中的类型
     * @return
     */
    public static MyResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }


}
