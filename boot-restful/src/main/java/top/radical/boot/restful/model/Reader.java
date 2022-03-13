package top.radical.boot.restful.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : radical
 * @description :读者
 * @data : 2022/3/10
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reader {
    private String name;
    private Integer age;

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(Reader.builder().name("radical").age(11).build());
    }

}
