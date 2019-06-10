package com.dsp.ad.mysql.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 44644
 */
@Data
public class ParseTemplate {

    private String database;

    private Map<String, TableTemplate> tableTemplateMap = new HashMap<>();


    public static ParseTemplate parse(){

    }
}
