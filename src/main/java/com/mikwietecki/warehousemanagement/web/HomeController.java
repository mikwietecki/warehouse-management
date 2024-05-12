package com.mikwietecki.warehousemanagement.web;


import com.mikwietecki.warehousemanagement.data.device.DeviceDto;
import com.mikwietecki.warehousemanagement.data.device.DeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    private final DeviceService deviceService;

    public HomeController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/home")
    public String home(Model model, @RequestParam(required = false) String search) {
        List<DeviceDto> devices;
        if (search != null && !search.isEmpty()) {
            devices = deviceService.findBySearchTerm(search);
        } else {
            devices = deviceService.findAllDevices();
        }
        model.addAttribute("devices", devices);
        return "home-screen";
    }
}
