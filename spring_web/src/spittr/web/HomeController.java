package spittr.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @RequestMapping(value = "/",method = GET)
    public String home(){
        return "home";
    }
    @RequestMapping(value="/json", method=GET)
    @ResponseBody
    public String testjson(){
        Table table=new Table();
        table.setCode(0);
        table.setCount(5);
        List<People> data=new ArrayList<People>();
//        for (int i=0;i<5;i++){
//            People people=new People();
//            people.setId(12130+i);
//            people.setUsername("yan"+i);
//            data.add(people);
//        }
        People people=new People();
            people.setId(12130);
            people.setUsername("yan");
            data.add(people);
        table.setData(data);
        return JSON.toJSONString(table);
    }
}
