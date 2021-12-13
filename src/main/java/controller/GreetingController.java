package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
