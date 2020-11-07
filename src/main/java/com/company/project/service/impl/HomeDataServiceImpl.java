package com.company.project.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.company.project.service.HomeDataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;

import static com.company.project.common.Constants.*;

/**
 * @author by wangtao
 * @date 2020/4/18.
 */
@Service
@Transactional
public class HomeDataServiceImpl implements HomeDataService {
    @Override
    public JSONObject getHomeDate() {
        JSONObject json = new JSONObject();

        File file = new File(IMAGES_PATH + "/banners");
        String[] fileArr = file.list();
        JSONArray ja = new JSONArray();
        for (String fileName : fileArr) {
            JSONObject json1 = new JSONObject();
            json1.put("URL", IMAGES_PATH_HTTP + "/banners/" + fileName);
            json1.put("Link", IMAGES_LINK);
            ja.add(json1);
        }
        json.put("banners", ja);

        ja = new JSONArray();
        File file2 = new File(IMAGES_PATH + "/recommend");
        String[] fileArr2 = file2.list();
        for (String fileName : fileArr2) {
            JSONObject json1 = new JSONObject();
            json1.put("URL", IMAGES_PATH_HTTP + "/recommend/" + fileName);
            json1.put("Link", IMAGES_LINK);
            ja.add(json1);
        }
        json.put("recommends", ja);

        return json;
    }

    @Override
    public JSONObject getHighQualityGoods() {
        JSONObject json = new JSONObject();

        String[] quantity = "1,2,3".split(",");
        for (String index : quantity) {
            File file = new File(IMAGES_PATH + "/highQualityGoods/" + index);
            String[] fileArr = file.list();
            JSONArray ja = new JSONArray();
            for (String fileName : fileArr) {
                JSONObject json1 = new JSONObject();
                json1.put("URL", IMAGES_PATH_HTTP + "/highQualityGoods/" + index + "/" + fileName);
                json1.put("Title", "测试文字" + index);
                ja.add(json1);
            }
            json.put(index, ja);
        }
        return json;
    }
}
