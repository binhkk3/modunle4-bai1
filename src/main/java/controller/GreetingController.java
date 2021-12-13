package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Controller
public class GreetingController {
    @GetMapping("/a")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
    @GetMapping("/binh")
    public String callbinhkk (Model model){
        model.addAttribute("name","NNN");
        return "binhkk";
    }
    @PostMapping ("/tong")
    public String getSum(@RequestParam int a,int b,Model model){
        model.addAttribute("ketqua",a+b);
        return "ketqua";
    }
    @GetMapping("/tong")
    public  String showSum(){
        return  "tong";
    }
    @PostMapping ("/doitien")
    public String getMoney(@RequestParam int a, Model model){
        model.addAttribute("tigia",a*23000);
        return "gia";
    }
    @GetMapping("/doitien")
    public String showMoney(){
        return "tien";
    }
    @PostMapping ("/tudien")
    public String getTudien(@RequestParam String a, Model model){

        Map<String ,String> map = new TreeMap<String,String>();
        map.put("a","dung");
        map.put("hello","xin chao");
        map.put("dog","cho");
        int index = -1;

        String kq="null";
        for (String key: map.keySet()
             ) {
            if(a.equals(key)){
                kq = map.get(key);
                model.addAttribute("tu",kq);
                index = index +1;
            }
        }
        if(index==-1){
            kq= "khong co";
            model.addAttribute("tu",kq);
        }

        return "tu";
    }
    @GetMapping("/tudien")
    public String gettudien(){return "tu";}
}
