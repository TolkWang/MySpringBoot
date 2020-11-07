package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.service.HomeDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("/home")
public class HomeDataController {
    @Resource
    private HomeDataService homeDataService;

    @RequestMapping(value = "/homeData")
    public Result homeData() throws IOException {
        return ResultGenerator.genSuccessResult(homeDataService.getHomeDate());
    }

    @RequestMapping(value = "/goodsData")
    public Result goodsData() throws IOException {
        return ResultGenerator.genSuccessResult(homeDataService.getHighQualityGoods());
    }
}
