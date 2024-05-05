package com.mikwietecki.warehousemanagement.web;


import com.mikwietecki.warehousemanagement.data.device.DeviceDto;
import com.mikwietecki.warehousemanagement.data.device.DeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final DeviceService deviceService;

    public HomeController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/home")
    public String home(Model model) {
        List<DeviceDto> allDevices = deviceService.findAllDevices();
        model.addAttribute("devices", allDevices);
        return "home-screen";
    }
}
